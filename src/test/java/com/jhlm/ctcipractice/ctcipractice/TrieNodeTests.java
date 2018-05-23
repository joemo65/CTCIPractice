package com.jhlm.ctcipractice.ctcipractice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrieNodeTests {

	@Test
	public void TrieNode_NotNull() {
        TrieNode<Integer> root = new TrieNode<Integer>(1);
        assertNotNull(root);
	}

}
