package org.jiserte.misc.ConservationImage.managers;

import java.util.List;

import org.jiserte.misc.ConservationImage.ClustalProfiler;

import pair.Pair;

public class ProteinManager extends MoleculeManager{

	public static String alphabet = "ACDEFGHIKLMNPQRSTVWY";
	
	@Override
	public int alphabetSize() {
		return 20;
	}

	@Override
	public String alphabet() {
		return ProteinManager.alphabet;
	}

	@Override
	public String getProfile(ClustalProfiler clustalProfiler, List<Pair<String, String>> alin, GapManager gap) {
		return clustalProfiler.profileForProtein(alin,gap);
	}

}
