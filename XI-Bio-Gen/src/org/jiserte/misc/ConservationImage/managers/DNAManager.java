package org.jiserte.misc.ConservationImage.managers;

import java.util.List;

import org.jiserte.misc.ConservationImage.ClustalProfiler;

import pair.Pair;

public class DNAManager extends MoleculeManager{

	public static String alphabet = "ACTG";
	
	@Override
	public int alphabetSize() {
		return 4;
	}

	@Override
	public String alphabet() {
		return DNAManager.alphabet;
	}

	@Override
	public String getProfile(ClustalProfiler clustalProfiler, List<Pair<String, String>> alin, GapManager gap) {
		return clustalProfiler.profileForDNA(alin,gap);
	}

}
