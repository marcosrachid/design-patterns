package com.template.patterns.structural.composite;

import org.junit.Test;

import com.template.patterns.structural.composite.Box;
import com.template.patterns.structural.composite.Product;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/composite/java/2">Composite reference</a>
 *
 */
public class CompositeTest {

	@Test
	public void test() {
		String[] args = new String[]{"1", "2", "3"}; 
		Box root = initialize();
        int[] levels = new int[args.length];
        for (int i=0; i < args.length; i++) {
            levels[i] = Integer.parseInt(args[i]);
        }
        root.traverse( levels );
	}
	
	private static Box initialize() {
        Box[] nodes = new Box[7];
        nodes[1] = new Box( 1 );
        int[] waves = {1, 4, 7};
        for (int i=0; i < 3; i++) {
            nodes[2] = new Box(21+i);
            nodes[1].add(nodes[2]);
            int level = 3;
            for (int j=0; j < 4; j++) {
                nodes[level-1].add( new Product(level*10 + waves[i]));
                nodes[level] = new Box(level*10 + waves[i]+1);
                nodes[level-1].add(nodes[level]);
                nodes[level-1].add(new Product(level*10 + waves[i]+2));
                level++;
            }
        }
        return nodes[1];
    }

}
