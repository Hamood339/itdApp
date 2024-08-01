import { Component, inject, signal, OnInit, OnDestroy } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { HomeService } from './home.service';
import SharedModule from 'app/shared/shared.module';
import { AccountService } from 'app/core/auth/account.service';
import { Account } from 'app/core/auth/account.model';

import { FormsModule } from '@angular/forms';

@Component({
  standalone: true,
  selector: 'jhi-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
  imports: [SharedModule, RouterModule, FormsModule],
})
export default class HomeComponent implements OnInit, OnDestroy {
  account = signal<Account | null>(null);

  infos: any;

  private readonly destroy$ = new Subject<void>();

  private accountService = inject(AccountService);
  private router = inject(Router);
  private homeService = inject(HomeService);

  ngOnInit(): void {
    this.accountService
      .getAuthenticationState()
      .pipe(takeUntil(this.destroy$))
      .subscribe(account => this.account.set(account));
  }

  login(): void {
    this.router.navigate(['/login']);
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  getEtudiant(): void {
    this.homeService.getEtudiant().subscribe(infos => (this.infos = infos));
  }

  addEtudiant(): void {
    this.homeService.addEtudiant().subscribe(infos => (this.infos = infos));
  }
}
