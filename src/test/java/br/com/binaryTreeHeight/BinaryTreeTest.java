package br.com.binaryTreeHeight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {

    @Test
    public void test1() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        four.setRight(six);
        four.setLeft(two);

        two.setRight(three);
        two.setLeft(one);

        six.setRight(seven);
        six.setLeft(five);

        assertEquals(2, BinaryTree.getHeight(four));

    }

    @Test
    public void test2() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        one.setRight(two);

        two.setRight(three);

        three.setRight(five);

        five.setRight(six);
        five.setLeft(four);

        six.setRight(seven);

        assertEquals(3, BinaryTree.getHeight(three));

    }

}
