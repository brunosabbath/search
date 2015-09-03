package com.bruno.engine.builder;

import com.bruno.engine.model.Gene;

public class GeneBuilder {

	private static String strGene[];
	private static Gene gene;

	public static Gene strToGene(String str) {
		strGene = str.split("\t");
		gene = new Gene();

		for (int i = 0; i < strGene.length; i++) {
			setGene(i);
		}

		return gene;
	}

	private static void setGene(int i) {

		switch (i) {
			case 0:
				gene.setSymbol(strGene[i]);
				break;
			case 1:
				gene.setName(strGene[i]);
				break;
			case 2:
				gene.setGeneId(strGene[i]);
				break;
			case 3:
				gene.setChr(strGene[i]);
				break;
			case 4:
				gene.setChrBand(strGene[i]);
				break;
			case 5:
				gene.setCancerSomaticMut(strGene[i]);
				break;
			case 6:
				gene.setCancerGermlineMut(strGene[i]);
				break;
			case 7:
				gene.setTumorTypesSomatic(strGene[i]);
				break;
			case 8:
				gene.setTumorTypesGermline(strGene[i]);
				break;
			case 9:
				gene.setCancerSyndrome(strGene[i]);
				break;
			case 10:
				gene.setTissueType(strGene[i]);
				break;
			case 11:
				gene.setCancerMolecularGenetics(strGene[i]);
				break;
			case 12:
				gene.setMutationType(strGene[i]);
				break;
			case 13:
				gene.setTranslocationPartner(strGene[i]);
				break;
			case 14:
				gene.setOtherGermlineMut(strGene[i]);
				break;
			case 15:
				gene.setOtherSyndrome(strGene[i]);
				break;
		}
	}

}
