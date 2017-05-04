import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class GUI extends JFrame implements ActionListener
{ JPanel panel = new JPanel();
  Controller cont = Controller.inst();
  JButton loadModelButton = new JButton("loadModel");
  JButton saveModelButton = new JButton("saveModel");
  JButton allocateStaffButton = new JButton("allocateStaff");
  JButton displayScheduleButton = new JButton("displaySchedule");
  JButton initButton = new JButton("init");
  JButton calculateCostButton = new JButton("calculateCost");

 public GUI()
  { super("Select use case to execute");
    setContentPane(panel);
    addWindowListener(new WindowAdapter() 
    { public void windowClosing(WindowEvent e)
      { System.exit(0); } });
  panel.add(loadModelButton);
  loadModelButton.addActionListener(this);
  panel.add(saveModelButton);
  saveModelButton.addActionListener(this);
  panel.add(allocateStaffButton);
  allocateStaffButton.addActionListener(this);
  panel.add(displayScheduleButton);
  displayScheduleButton.addActionListener(this);
  panel.add(initButton);
  initButton.addActionListener(this);
  panel.add(calculateCostButton);
  calculateCostButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { if (e == null) { return; }
    String cmd = e.getActionCommand();
    if ("loadModel".equals(cmd))
    { Controller.loadModel("in.txt");
      System.err.println("Model loaded");
      return; } 
    if ("saveModel".equals(cmd))
    { cont.saveModel("out.txt");  
      return; } 
    if ("allocateStaff".equals(cmd))
    {  cont.allocateStaff() ;  return; } 
    if ("displaySchedule".equals(cmd))
    {  cont.displaySchedule() ;  return; } 
    if ("init".equals(cmd))
    {  cont.init() ;  return; } 
    if ("calculateCost".equals(cmd))
    {  cont.calculateCost() ;  return; } 
  }

  public static void main(String[] args)
  {  GUI gui = new GUI();
    gui.setSize(400,400);
    gui.setVisible(true);
  }
 }
