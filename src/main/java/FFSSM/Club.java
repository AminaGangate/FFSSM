/**
 * @(#) Club.java
 */
package FFSSM;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Club {

    public Moniteur president;

    public String nom;

    public String adresse;

    public String telephone;

    private final List<Plongee> lesplongees = new LinkedList<>();

    public Club(Moniteur président, String nom, String telephone) {
        this.president = président;
        this.nom = nom;
        this.telephone = telephone;
    }

    /**
     * Calcule l'ensemble des plongées non conformes organisées par ce club. Une
     * plongée est conforme si tous les plongeurs de la palanquée ont une
     * licence valide à la date de la plongée
     *
     * @return l'ensemble des plongées non conformes
     */
    public Set<Plongee> plongeesNonConformes() {

        if (Licence.delivrance > LocalDate.plusYears(1)) {
            throw new UnsupportedOperationException("La plongée n'est pas conforme car la licence n'est plus valide");

        }
        return null;
    }
   
        /**
         * Enregistre une nouvelle plongée organisée par ce club
         *
         * @param p la nouvelle plongée
         */
    public void organisePlongee(Plongee p) {
        Plongee p = new Plongee(this, p);
        lesplongees.add(p);
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    public Moniteur getPresident() {
        return president;
    }

    public void setPresident(Moniteur président) {
        this.president = président;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Club{" + "président=" + president + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }

}
