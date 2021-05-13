/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Anderson Soares
 */
public class CartaParametros {
    private String co_variances_1;
    private String co_variances_2;
    private String datafile_1;
    private String datafile_2;
    private String effect_1;
    private String effect_2;
    private String effect_3;
    private String effect_4;
    private String fieldspassed;
    private String randon_1;
    private String randon_2;
    private String residualVariance;
    private String traits;
    private String weights;

    public CartaParametros() {
    }
    
    public CartaParametros(String co_variances_1, String co_variances_2, String datafile_1, String datafile_2, String effect_1, String effect_2, String effect_3, String effect_4, String fieldspassed, String randon_1, String randon_2, String residualVariance, String traits, String weights) {
        this.co_variances_1 = co_variances_1;
        this.co_variances_2 = co_variances_2;
        this.datafile_1 = datafile_1;
        this.datafile_2 = datafile_2;
        this.effect_1 = effect_1;
        this.effect_2 = effect_2;
        this.effect_3 = effect_3;
        this.effect_4 = effect_4;
        this.fieldspassed = fieldspassed;
        this.randon_1 = randon_1;
        this.randon_2 = randon_2;
        this.residualVariance = residualVariance;
        this.traits = traits;
        this.weights = weights;
    }
    
    /**
     * @return the co_variances_1
     */
    public String getCo_variances_1() {
        return co_variances_1;
    }

    /**
     * @param co_variances_1 the co_variances_1 to set
     */
    public void setCo_variances_1(String co_variances_1) {
        this.co_variances_1 = co_variances_1;
    }

    /**
     * @return the co_variances_2
     */
    public String getCo_variances_2() {
        return co_variances_2;
    }

    /**
     * @param co_variances_2 the co_variances_2 to set
     */
    public void setCo_variances_2(String co_variances_2) {
        this.co_variances_2 = co_variances_2;
    }

    /**
     * @return the datafile_1
     */
    public String getDatafile_1() {
        return datafile_1;
    }

    /**
     * @param datafile_1 the datafile_1 to set
     */
    public void setDatafile_1(String datafile_1) {
        this.datafile_1 = datafile_1;
    }

    /**
     * @return the datafile_2
     */
    public String getDatafile_2() {
        return datafile_2;
    }

    /**
     * @param datafile_2 the datafile_2 to set
     */
    public void setDatafile_2(String datafile_2) {
        this.datafile_2 = datafile_2;
    }

    /**
     * @return the effect_1
     */
    public String getEffect_1() {
        return effect_1;
    }

    /**
     * @param effect_1 the effect_1 to set
     */
    public void setEffect_1(String effect_1) {
        this.effect_1 = effect_1;
    }

    /**
     * @return the effect_2
     */
    public String getEffect_2() {
        return effect_2;
    }

    /**
     * @param effect_2 the effect_2 to set
     */
    public void setEffect_2(String effect_2) {
        this.effect_2 = effect_2;
    }

    /**
     * @return the effect_3
     */
    public String getEffect_3() {
        return effect_3;
    }

    /**
     * @param effect_3 the effect_3 to set
     */
    public void setEffect_3(String effect_3) {
        this.effect_3 = effect_3;
    }

    /**
     * @return the effect_4
     */
    public String getEffect_4() {
        return effect_4;
    }

    /**
     * @param effect_4 the effect_4 to set
     */
    public void setEffect_4(String effect_4) {
        this.effect_4 = effect_4;
    }

    /**
     * @return the fieldspassed
     */
    public String getFieldspassed() {
        return fieldspassed;
    }

    /**
     * @param fieldspassed the fieldspassed to set
     */
    public void setFieldspassed(String fieldspassed) {
        this.fieldspassed = fieldspassed;
    }

    /**
     * @return the randon_1
     */
    public String getRandon_1() {
        return randon_1;
    }

    /**
     * @param randon_1 the randon_1 to set
     */
    public void setRandon_1(String randon_1) {
        this.randon_1 = randon_1;
    }

    /**
     * @return the randon_2
     */
    public String getRandon_2() {
        return randon_2;
    }

    /**
     * @param randon_2 the randon_2 to set
     */
    public void setRandon_2(String randon_2) {
        this.randon_2 = randon_2;
    }

    /**
     * @return the residualVariance
     */
    public String getResidualVariance() {
        return residualVariance;
    }

    /**
     * @param residualVariance the residualVariance to set
     */
    public void setResidualVariance(String residualVariance) {
        this.residualVariance = residualVariance;
    }

    /**
     * @return the traits
     */
    public String getTraits() {
        return traits;
    }

    /**
     * @param traits the traits to set
     */
    public void setTraits(String traits) {
        this.traits = traits;
    }

    /**
     * @return the weights
     */
    public String getWeights() {
        return weights;
    }

    /**
     * @param weights the weights to set
     */
    public void setWeights(String weights) {
        this.weights = weights;
    }
    
    
}
