package edu.iis.mto.similarity;

import static org.junit.jupiter.api.Assertions.*;

import edu.iis.mto.searcher.SearchResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimilarityFinderTest {

    SimilarityFinder similarityFinder;
    @BeforeEach
    void initSimilarityFinder(){
        similarityFinder = new SimilarityFinder(((elem, sequence) -> SearchResult.builder().build()));
    }
    @Test
    void TwoSequencesAreEmpty() {
        int[] seq1={};
        int[] seq2={};
        double expected=1;
        double result=similarityFinder.calculateJackardSimilarity(seq1,seq2);
        assertEquals(expected,result);
    }

}
