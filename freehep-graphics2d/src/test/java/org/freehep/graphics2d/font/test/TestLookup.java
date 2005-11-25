// Copyright 2005, FreeHEP.
package org.freehep.graphics2d.font.test;

import org.freehep.graphics2d.font.*;

/**
 * Test class to test the generated Encoding Tables.
 *
 * @author Sami Lama
 * @version $Id: freehep-graphics2d/src/test/java/org/freehep/graphics2d/font/test/TestLookup.java f5b43d67642f 2005/11/25 23:10:27 duns $
 */
public class TestLookup {
    
	public static void main(String[] args){
		Lookup lookAtIt = null;
		Lookup lookAtThis = null;
		CharTable aTable = null;
		lookAtIt=Lookup.getInstance();
		aTable=lookAtIt.getTable("PDFLatin");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("STDLatin");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("MACLatin");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("WINLatin");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("ISOLatin");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("Symbol");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("ZapfDingbats");
		for (int i=0; i<256; i++) {
			System.out.println(aTable.toName(i));
		}
		aTable=lookAtIt.getTable("Expert");
		for (int i=0; i<256; i++){
			System.out.println(aTable.toName(i));
		}
		System.out.println(aTable.toEncoding("Aacutesmall"));
		System.out.println(lookAtIt.toName('\uF8E8'));
				
	}
}