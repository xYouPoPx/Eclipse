package com.pam.codenamehippie.modele;

import com.google.gson.annotations.SerializedName;

/**
 * Classe servant à modeler des élement provenant des tables de lookup de la base de données.
 */
public class DescriptionModel extends BaseModele<DescriptionModel> {

    @SerializedName("description")
    private String description = "Faites votre choix...";

    /**
     * Accesseur la description
     *
     * @return retourne la valeur du champ description
     */
    public String getDescription() {
        return this.description;
    }
}
