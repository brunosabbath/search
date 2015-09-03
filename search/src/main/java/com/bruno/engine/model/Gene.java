package com.bruno.engine.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Gene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String cancerGermlineMut;

	private String cancerMolecularGenetics;

	private String cancerSomaticMut;

	private String cancerSyndrome;

	private String chr;

	private String chrBand;

	private String geneId;

	private String mutationType;

	private String name;

	private String otherGermlineMut;

	private String otherSyndrome;

	private String symbol;

	private String tissueType;

	private String translocationPartner;

	private String tumorTypesGermline;

	private String tumorTypesSomatic;

	public Gene() {
		this.cancerGermlineMut = "";
		this.cancerMolecularGenetics = "";
		this.cancerSomaticMut = "";
		this.cancerSyndrome = "";
		this.chr = "";
		this.chrBand = "";
		this.geneId = "";
		this.mutationType = "";
		this.name = "";
		this.otherGermlineMut = "";
		this.otherSyndrome = "";
		this.symbol = "";
		this.tissueType = "";
		this.translocationPartner = "";
		this.tumorTypesGermline = "";
		this.tumorTypesSomatic = "";
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCancerGermlineMut() {
		return this.cancerGermlineMut;
	}

	public Gene setCancerGermlineMut(String cancerGermlineMut) {
		this.cancerGermlineMut = cancerGermlineMut;
		return this;
	}

	public String getCancerMolecularGenetics() {
		return this.cancerMolecularGenetics;
	}

	public Gene setCancerMolecularGenetics(String cancerMolecularGenetics) {
		this.cancerMolecularGenetics = cancerMolecularGenetics;
		return this;
	}

	public String getCancerSomaticMut() {
		return this.cancerSomaticMut;
	}

	public Gene setCancerSomaticMut(String cancerSomaticMut) {
		this.cancerSomaticMut = cancerSomaticMut;
		return this;
	}

	public String getCancerSyndrome() {
		return this.cancerSyndrome;
	}

	public Gene setCancerSyndrome(String cancerSyndrome) {
		this.cancerSyndrome = cancerSyndrome;
		return this;
	}

	public String getChr() {
		return this.chr;
	}

	public Gene setChr(String chr) {
		this.chr = chr;
		return this;
	}

	public String getChrBand() {
		return this.chrBand;
	}

	public Gene setChrBand(String chrBand) {
		this.chrBand = chrBand;
		return this;
	}

	public String getGeneId() {
		return this.geneId;
	}

	public Gene setGeneId(String geneId) {
		this.geneId = geneId;
		return this;
	}

	public String getMutationType() {
		return this.mutationType;
	}

	public Gene setMutationType(String mutationType) {
		this.mutationType = mutationType;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public Gene setName(String name) {
		this.name = name;
		return this;
	}

	public String getOtherGermlineMut() {
		return this.otherGermlineMut;
	}

	public Gene setOtherGermlineMut(String otherGermlineMut) {
		this.otherGermlineMut = otherGermlineMut;
		return this;
	}

	public String getOtherSyndrome() {
		return this.otherSyndrome;
	}

	public Gene setOtherSyndrome(String otherSyndrome) {
		this.otherSyndrome = otherSyndrome;
		return this;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public Gene setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public String getTissueType() {
		return this.tissueType;
	}

	public Gene setTissueType(String tissueType) {
		this.tissueType = tissueType;
		return this;
	}

	public String getTranslocationPartner() {
		return this.translocationPartner;
	}

	public Gene setTranslocationPartner(String translocationPartner) {
		this.translocationPartner = translocationPartner;
		return this;
	}

	public String getTumorTypesGermline() {
		return this.tumorTypesGermline;
	}

	public Gene setTumorTypesGermline(String tumorTypesGermline) {
		this.tumorTypesGermline = tumorTypesGermline;
		return this;
	}

	public String getTumorTypesSomatic() {
		return this.tumorTypesSomatic;
	}

	public Gene setTumorTypesSomatic(String tumorTypesSomatic) {
		this.tumorTypesSomatic = tumorTypesSomatic;
		return this;
	}

}