package com.itdhub.gestonitd.service.NosServices;

import com.itdhub.gestonitd.domain.classes.Etudiants;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    Etudiants etudiants = new Etudiants();

    /*  public String algoEtude() {




        System.out.println("Veillez saisir les informations de l'etudiant");
        Scanner sc = new Scanner(System.in);

        System.out.println("Veillez saisir le Prénom de l'etudiant");
        prenom= sc.nextLine();

        System.out.println("Veillez saisir le Nom de l'etudiant");
        nom = sc.nextLine();

        System.out.println("Veillez saisir l' Adresse de l'etudiant");
        adresse = sc.nextLine();

        System.out.println("Veillez saisir le Numero de telephone de l'etudiant");
        telephone = sc.nextLine();

        System.out.println("Veillez saisir l'Email de l'etudiant");
        email = sc.nextLine();

        System.out.println("Veillez saisir la Date de Naissance  de l'etudiant");
        dateNaissance = sc.nextLine();

        System.out.println("Veillez saisir le Lieu de Naissance  de l'etudiant");
        lieuDenessance = sc.nextLine();

        System.out.println("Quel est le sexe de l'etudiant ?");
        sexe = sc.nextLine();


        System.out.println("Veillez saisir le Niveau d'Etude de l'etudiant");
        niveau = sc.nextInt();

        System.out.println("Veillez saisir l la filiere de l'etudiant");
        filiere = sc.nextLine();


        //algo du niveau d'etude

        if (niveau <= 3) {
            System.out.println("l'etudiant" + prenom + "" + nom + "" + " est au premiere cycle universitaire en" + "" + filiere);
        } else if ((niveau > 3) && (niveau <= 5)) {
            System.out.println("l'etudiant" + prenom + "" + nom + "" + " est au deuxieme cycle universitaire en" + "" + filiere);
        } else {
            System.out.println("l'etudiant" + prenom + "" + nom + "" + " est au troisieme cycle universitaire en" + "" + filiere);
        }

        return "L'étudiant(e)"+""+prenom+" "+nom+" "+"né(e) le"+" "+dateNaissance+" "+"à"+""+lieuDenessance+" "+"est etudiant à l'institut des technologie du Digital";
*/

    public Etudiants infoEtudiant() {
        etudiants.setPrenom(etudiants.getPrenom());
        etudiants.setNom(etudiants.getNom());
        etudiants.setDateNaissance(etudiants.getDateNaissance());
        etudiants.setLieuDenessance(etudiants.getLieuDenessance());
        etudiants.setEmail(etudiants.getEmail());
        etudiants.setAdresse(etudiants.getAdresse());
        etudiants.setTelephone(etudiants.getTelephone());
        etudiants.setSexe(etudiants.getSexe());
        etudiants.setNiveau(etudiants.getNiveau());
        etudiants.setFiliere(etudiants.getFiliere());

        return etudiants;
    }
}
