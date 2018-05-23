package com.jhlm.ctcipractice.ctcipractice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListNodeTests {

	@Test
	public void ListNode_NotNull() {
        ListNode<Integer> head = new ListNode<Integer>(1);
        assertNotNull(head);
	}

}
