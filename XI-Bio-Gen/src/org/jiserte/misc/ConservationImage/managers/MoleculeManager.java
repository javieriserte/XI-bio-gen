package org.jiserte.misc.ConservationImage.managers;

import java.util.List;

import org.jiserte.misc.ConservationImage.ClustalProfiler;

import pair.Pair;

public abstract class MoleculeManager {

	public abstract int alphabetSize();
	
	public abstract String alphabet();

	public abstract String getProfile(ClustalProfiler clustalProfiler, List<Pair<String, String>> alin, GapManager gap);
	
}
