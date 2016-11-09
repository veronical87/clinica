/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author veronica
 */
public class JTextFieldToUpperCase extends PlainDocument{
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
      super.insertString(offset, str.toUpperCase(), attr);
    }
}
