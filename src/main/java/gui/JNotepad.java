/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author ADMIN
 */
public class JNotepad extends JFrame{
    private JMenuBar mBar; 
    private JMenu mFile, mEdit,mFormat, mView, mZoom, mHelp;
    private JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemPageSetup, itemPrint, itemExit; 
    private JMenuItem itemUndo, itemCut, itemCopy, itemPaste,itemDelete;
    private JMenuItem itemFont;
    private JMenuItem itemZoomIn, itemZoomOut;
    private JCheckBoxMenuItem itemWrap, itemStatusBar;
    private JTextArea txtEditor;
 
    public JNotepad (String title){
        super(title);
        createGUI();
        createMenu();
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createMenu() {
      mBar = new JMenuBar();
      
      mBar.add(mFile = new JMenu("File"));
     
      mBar.add(mEdit= new JMenu("Edit"));
      
      mBar.add(mFormat= new JMenu("Format"));
      mBar.add(mView = new JMenu("View"));
      mBar.add(mZoom = new JMenu("Zoom"));
      mBar.add(mHelp = new JMenu("Help"));
      
      
      
      mFile.add(itemNew = new JMenuItem("New"));
      mFile.add(itemOpen = new JMenuItem("Open..."));
      mFile.add(itemSave = new JMenuItem("Save"));
      mFile.add(itemSaveAs = new JMenuItem("Save As..."));
     
      mFile.addSeparator();
      mFile.add(itemPageSetup = new JMenuItem("New"));
      mFile.add(itemPrint = new JMenuItem("Print"));
      mFile.addSeparator();
      mFile.add(itemExit = new JMenuItem("Exit"));
      //menu view
      mView.add(mZoom = new JMenu("Zoom"));
      mZoom.add(itemZoomIn = new JMenuItem("ZoomIn"));
      mZoom.add(itemZoomOut = new JMenuItem("ZoomOut"));
      mView.add(itemStatusBar = new JCheckBoxMenuItem("Status", true));
      
      //Edit
      mEdit.add(itemUndo = new JMenuItem("Undo"));
      mEdit.add(itemCut = new JMenuItem("Cut"));
      mEdit.add(itemCopy = new JMenuItem("Copy"));
      mEdit.add(itemPaste = new JMenuItem("Paste"));
      mEdit.add(itemDelete = new JMenuItem("Delete"));
      //Format
      mFormat.add(itemWrap = new JCheckBoxMenuItem("Word Wrap", true));
      mFormat.add(itemFont = new JMenuItem("Font.."));
      
      
      itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
      itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
      itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
      itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
      itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));
      
      
      itemZoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemZoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      
      
      itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemWrap.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      itemFont.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
      
      setJMenuBar(mBar);
      itemExit.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              if(JOptionPane.showConfirmDialog(null, "Are you sure to exit?") == JOptionPane.YES_OPTION);
              System.exit(0);
          
          }
      });
    }
    public static void main(String[] args) {
        JNotepad notepad = new JNotepad("Demo Notdepad");
        notepad.setVisible(true);
    }

    private void createGUI() {
        txtEditor = new JTextArea();
        JScrollPane scrollEditor = new JScrollPane(txtEditor);
        add(scrollEditor);
        txtEditor.setFont(new Font("Arial", Font.PLAIN,10));
        
    }
    
}
        
