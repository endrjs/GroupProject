import java.util.*;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;

class Skill
  implements SystemTypes
{
  private String skillId; // internal

  public Skill()
  {
    this.skillId = "";

  }



  public String toString()
  { String _res_ = "(Skill) ";
    _res_ = _res_ + skillId;
    return _res_;
  }

  public void setskillId(String skillId_x) { skillId = skillId_x;  }


    public static void setAllskillId(Collection skill_s,String val)
  { for (Object _o : skill_s)
    { Skill skill_x = (Skill) _o;
      Controller.inst().setskillId(skill_x,val); } }


    public String getskillId() { return skillId; }

    public static HashSet getAllskillId(Collection skill_s)
  { HashSet result = new HashSet();
    for (Object _o : skill_s)
    { Skill skill_x = (Skill) _o;
      result.add(skill_x.getskillId()); }
    return result; }

    public static ArrayList getAllOrderedskillId(Collection skill_s)
  { ArrayList result = new ArrayList();
    for (Object _o : skill_s)
    { Skill skill_x = (Skill) _o;
      result.add(skill_x.getskillId()); } 
    return result; }


}


class Staff
  implements SystemTypes
{
  private String staffId; // internal
  private int costDay; // internal
  private HashSet completes = new HashSet(); // of Assignment
  private HashSet has = new HashSet(); // of Skill

  public Staff()
  {
    this.staffId = "";
    this.costDay = 0;

  }



  public String toString()
  { String _res_ = "(Staff) ";
    _res_ = _res_ + staffId + ",";
    _res_ = _res_ + costDay;
    return _res_;
  }

  public void setstaffId(String staffId_x) { staffId = staffId_x;  }


    public static void setAllstaffId(Collection staff_s,String val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().setstaffId(staff_x,val); } }


  public void setcostDay(int costDay_x) { costDay = costDay_x;  }


    public static void setAllcostDay(Collection staff_s,int val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().setcostDay(staff_x,val); } }


  public void setcompletes(HashSet completes_xx) { completes = completes_xx;
    }
 
  public void addcompletes(Assignment completes_xx) { completes.add(completes_xx);
    }
 
  public void removecompletes(Assignment completes_xx) { completes.remove(completes_xx);
    }

  public static void setAllcompletes(Collection staff_s,HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().setcompletes(staff_x, _val); } }

  public static void addAllcompletes(Collection staff_s,Assignment _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().addcompletes(staff_x, _val); } }


  public static void removeAllcompletes(Collection staff_s,Assignment _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().removecompletes(staff_x, _val); } }


  public static void unionAllcompletes(Collection staff_s, HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().unioncompletes(staff_x, _val); } }


  public static void subtractAllcompletes(Collection staff_s, HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().subtractcompletes(staff_x, _val); } }


  public void sethas(HashSet has_xx) { has = has_xx;
    }
 
  public void addhas(Skill has_xx) { has.add(has_xx);
    }
 
  public void removehas(Skill has_xx) { has.remove(has_xx);
    }

  public static void setAllhas(Collection staff_s,HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().sethas(staff_x, _val); } }

  public static void addAllhas(Collection staff_s,Skill _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().addhas(staff_x, _val); } }


  public static void removeAllhas(Collection staff_s,Skill _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().removehas(staff_x, _val); } }


  public static void unionAllhas(Collection staff_s, HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().unionhas(staff_x, _val); } }


  public static void subtractAllhas(Collection staff_s, HashSet _val)
  { for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      Controller.inst().subtracthas(staff_x, _val); } }


    public String getstaffId() { return staffId; }

    public static HashSet getAllstaffId(Collection staff_s)
  { HashSet result = new HashSet();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.add(staff_x.getstaffId()); }
    return result; }

    public static ArrayList getAllOrderedstaffId(Collection staff_s)
  { ArrayList result = new ArrayList();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.add(staff_x.getstaffId()); } 
    return result; }

    public int getcostDay() { return costDay; }

    public static HashSet getAllcostDay(Collection staff_s)
  { HashSet result = new HashSet();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.add(new Integer(staff_x.getcostDay())); }
    return result; }

    public static ArrayList getAllOrderedcostDay(Collection staff_s)
  { ArrayList result = new ArrayList();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.add(new Integer(staff_x.getcostDay())); } 
    return result; }

  public HashSet getcompletes() { return (HashSet) ((HashSet) completes).clone(); }

  public static HashSet getAllcompletes(Collection staff_s)
  { HashSet result = new HashSet();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.addAll(staff_x.getcompletes()); }
    return result; }

  public static ArrayList getAllOrderedcompletes(Collection staff_s)
  { ArrayList result = new ArrayList();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.addAll(staff_x.getcompletes()); }
    return result; }

  public HashSet gethas() { return (HashSet) ((HashSet) has).clone(); }

  public static HashSet getAllhas(Collection staff_s)
  { HashSet result = new HashSet();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.addAll(staff_x.gethas()); }
    return result; }

  public static ArrayList getAllOrderedhas(Collection staff_s)
  { ArrayList result = new ArrayList();
    for (Object _o : staff_s)
    { Staff staff_x = (Staff) _o;
      result.addAll(staff_x.gethas()); }
    return result; }


}


class Task
  implements SystemTypes
{
  private String taskId; // internal
  private int duration; // internal
  private HashSet needs = new HashSet(); // of Skill
  private HashSet completes = new HashSet(); // of Assignment
  private HashSet dependsOn = new HashSet(); // of Task
  private Task subTask;

  public Task(Task subTask)
  {
    this.taskId = "";
    this.duration = 0;
    this.subTask = subTask;

  }

  public Task() { }



  public String toString()
  { String _res_ = "(Task) ";
    _res_ = _res_ + taskId + ",";
    _res_ = _res_ + duration;
    return _res_;
  }

  public void settaskId(String taskId_x) { taskId = taskId_x;  }


    public static void setAlltaskId(Collection task_s,String val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().settaskId(task_x,val); } }


  public void setduration(int duration_x) { duration = duration_x;  }


    public static void setAllduration(Collection task_s,int val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().setduration(task_x,val); } }


  public void setneeds(HashSet needs_xx) { needs = needs_xx;
    }
 
  public void addneeds(Skill needs_xx) { needs.add(needs_xx);
    }
 
  public void removeneeds(Skill needs_xx) { needs.remove(needs_xx);
    }

  public static void setAllneeds(Collection task_s,HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().setneeds(task_x, _val); } }

  public static void addAllneeds(Collection task_s,Skill _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().addneeds(task_x, _val); } }


  public static void removeAllneeds(Collection task_s,Skill _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().removeneeds(task_x, _val); } }


  public static void unionAllneeds(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().unionneeds(task_x, _val); } }


  public static void subtractAllneeds(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().subtractneeds(task_x, _val); } }


  public void setcompletes(HashSet completes_xx) { completes = completes_xx;
    }
 
  public void addcompletes(Assignment completes_xx) { completes.add(completes_xx);
    }
 
  public void removecompletes(Assignment completes_xx) { completes.remove(completes_xx);
    }

  public static void setAllcompletes(Collection task_s,HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().setcompletes(task_x, _val); } }

  public static void addAllcompletes(Collection task_s,Assignment _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().addcompletes(task_x, _val); } }


  public static void removeAllcompletes(Collection task_s,Assignment _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().removecompletes(task_x, _val); } }


  public static void unionAllcompletes(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().unioncompletes(task_x, _val); } }


  public static void subtractAllcompletes(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().subtractcompletes(task_x, _val); } }


  public void setdependsOn(HashSet dependsOn_xx) { dependsOn = dependsOn_xx;
    }
 
  public void adddependsOn(Task dependsOn_xx) { dependsOn.add(dependsOn_xx);
    }
 
  public void removedependsOn(Task dependsOn_xx) { dependsOn.remove(dependsOn_xx);
    }

  public static void setAlldependsOn(Collection task_s,HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().setdependsOn(task_x, _val); } }

  public static void addAlldependsOn(Collection task_s,Task _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().adddependsOn(task_x, _val); } }


  public static void removeAlldependsOn(Collection task_s,Task _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().removedependsOn(task_x, _val); } }


  public static void unionAlldependsOn(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().uniondependsOn(task_x, _val); } }


  public static void subtractAlldependsOn(Collection task_s, HashSet _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().subtractdependsOn(task_x, _val); } }


  public void setsubTask(Task subTask_xx) { subTask = subTask_xx;
  }

  public static void setAllsubTask(Collection task_s,Task _val)
  { for (Object _o : task_s)
    { Task task_x = (Task) _o;
      Controller.inst().setsubTask(task_x, _val); } }

    public String gettaskId() { return taskId; }

    public static HashSet getAlltaskId(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(task_x.gettaskId()); }
    return result; }

    public static ArrayList getAllOrderedtaskId(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(task_x.gettaskId()); } 
    return result; }

    public int getduration() { return duration; }

    public static HashSet getAllduration(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(new Integer(task_x.getduration())); }
    return result; }

    public static ArrayList getAllOrderedduration(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(new Integer(task_x.getduration())); } 
    return result; }

  public HashSet getneeds() { return (HashSet) ((HashSet) needs).clone(); }

  public static HashSet getAllneeds(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getneeds()); }
    return result; }

  public static ArrayList getAllOrderedneeds(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getneeds()); }
    return result; }

  public HashSet getcompletes() { return (HashSet) ((HashSet) completes).clone(); }

  public static HashSet getAllcompletes(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getcompletes()); }
    return result; }

  public static ArrayList getAllOrderedcompletes(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getcompletes()); }
    return result; }

  public HashSet getdependsOn() { return (HashSet) ((HashSet) dependsOn).clone(); }

  public static HashSet getAlldependsOn(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getdependsOn()); }
    return result; }

  public static ArrayList getAllOrdereddependsOn(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.addAll(task_x.getdependsOn()); }
    return result; }

  public Task getsubTask() { return subTask; }

  public static HashSet getAllsubTask(Collection task_s)
  { HashSet result = new HashSet();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(task_x.getsubTask()); }
    return result; }

  public static ArrayList getAllOrderedsubTask(Collection task_s)
  { ArrayList result = new ArrayList();
    for (Object _o : task_s)
    { Task task_x = (Task) _o;
      result.add(task_x.getsubTask()); }
    return result; }


}


class Assignment
  implements SystemTypes
{
  private Staff assigned;
  private Task assignedTo;

  public Assignment(Staff assigned,Task assignedTo)
  {
    this.assigned = assigned;
    this.assignedTo = assignedTo;

  }

  public Assignment() { }



  public void setassigned(Staff assigned_xx) { assigned = assigned_xx;
  }

  public static void setAllassigned(Collection assignment_s,Staff _val)
  { for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      Controller.inst().setassigned(assignment_x, _val); } }

  public void setassignedTo(Task assignedTo_xx) { assignedTo = assignedTo_xx;
  }

  public static void setAllassignedTo(Collection assignment_s,Task _val)
  { for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      Controller.inst().setassignedTo(assignment_x, _val); } }

  public Staff getassigned() { return assigned; }

  public static HashSet getAllassigned(Collection assignment_s)
  { HashSet result = new HashSet();
    for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      result.add(assignment_x.getassigned()); }
    return result; }

  public static ArrayList getAllOrderedassigned(Collection assignment_s)
  { ArrayList result = new ArrayList();
    for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      result.add(assignment_x.getassigned()); }
    return result; }

  public Task getassignedTo() { return assignedTo; }

  public static HashSet getAllassignedTo(Collection assignment_s)
  { HashSet result = new HashSet();
    for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      result.add(assignment_x.getassignedTo()); }
    return result; }

  public static ArrayList getAllOrderedassignedTo(Collection assignment_s)
  { ArrayList result = new ArrayList();
    for (Object _o : assignment_s)
    { Assignment assignment_x = (Assignment) _o;
      result.add(assignment_x.getassignedTo()); }
    return result; }

    public void allocateStaff()
  { {}
  }

    public String toString()
  {   String result = "";
  
  result = assigned.getstaffId() + " assigned to " + assignedTo.gettaskId();
  
    return result;
  }


    public int cost()
  {   int result = 0;
{}
  return result;

  }


}


class Story
  implements SystemTypes
{
  private String storyId; // internal
  private ArrayList subtasks = new ArrayList(); // of Task

  public Story()
  {
    this.storyId = "";

  }



  public String toString()
  { String _res_ = "(Story) ";
    _res_ = _res_ + storyId;
    return _res_;
  }

  public void setstoryId(String storyId_x) { storyId = storyId_x;  }


    public static void setAllstoryId(Collection story_s,String val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().setstoryId(story_x,val); } }


  public void setsubtasks(ArrayList subtasks_xx) { subtasks = subtasks_xx;
    }
 
  public void setsubtasks(int ind_x, Task subtasks_xx) { subtasks.set(ind_x, subtasks_xx); }

 public void addsubtasks(Task subtasks_xx) { subtasks.add(subtasks_xx);
    }
 
  public void removesubtasks(Task subtasks_xx) { subtasks.remove(subtasks_xx);
    }

  public static void setAllsubtasks(Collection story_s,ArrayList _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().setsubtasks(story_x, _val); } }

  public static void setAllsubtasks(Collection story_s,int _ind,Task _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().setsubtasks(story_x,_ind,_val); } }

  public static void addAllsubtasks(Collection story_s,Task _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().addsubtasks(story_x, _val); } }


  public static void removeAllsubtasks(Collection story_s,Task _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().removesubtasks(story_x, _val); } }


  public static void unionAllsubtasks(Collection story_s, ArrayList _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().unionsubtasks(story_x, _val); } }


  public static void subtractAllsubtasks(Collection story_s, ArrayList _val)
  { for (Object _o : story_s)
    { Story story_x = (Story) _o;
      Controller.inst().subtractsubtasks(story_x, _val); } }


    public String getstoryId() { return storyId; }

    public static HashSet getAllstoryId(Collection story_s)
  { HashSet result = new HashSet();
    for (Object _o : story_s)
    { Story story_x = (Story) _o;
      result.add(story_x.getstoryId()); }
    return result; }

    public static ArrayList getAllOrderedstoryId(Collection story_s)
  { ArrayList result = new ArrayList();
    for (Object _o : story_s)
    { Story story_x = (Story) _o;
      result.add(story_x.getstoryId()); } 
    return result; }

  public ArrayList getsubtasks() { return (ArrayList) ((ArrayList) subtasks).clone(); }

  public static HashSet getAllsubtasks(Collection story_s)
  { HashSet result = new HashSet();
    for (Object _o : story_s)
    { Story story_x = (Story) _o;
      result.addAll(story_x.getsubtasks()); }
    return result; }

  public static ArrayList getAllOrderedsubtasks(Collection story_s)
  { ArrayList result = new ArrayList();
    for (Object _o : story_s)
    { Story story_x = (Story) _o;
      result.addAll(story_x.getsubtasks()); }
    return result; }


}


class Schedule
  implements SystemTypes
{
  private int totalCost; // internal
  private ArrayList assigns = new ArrayList(); // of Assignment
  private ArrayList sortedStaff = new ArrayList(); // of Staff
  private ArrayList sortedTasks = new ArrayList(); // of Task

  public Schedule()
  {
    this.totalCost = 0;

  }



  public String toString()
  { String _res_ = "(Schedule) ";
    _res_ = _res_ + totalCost;
    return _res_;
  }

  public void settotalCost(int totalCost_x) { totalCost = totalCost_x;  }


    public static void setAlltotalCost(Collection schedule_s,int val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().settotalCost(schedule_x,val); } }


  public void setassigns(ArrayList assigns_xx) { assigns = assigns_xx;
    }
 
  public void setassigns(int ind_x, Assignment assigns_xx) { assigns.set(ind_x, assigns_xx); }

 public void addassigns(Assignment assigns_xx) { assigns.add(assigns_xx);
    }
 
  public void removeassigns(Assignment assigns_xx) { assigns.remove(assigns_xx);
    }

  public static void setAllassigns(Collection schedule_s,ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setassigns(schedule_x, _val); } }

  public static void setAllassigns(Collection schedule_s,int _ind,Assignment _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setassigns(schedule_x,_ind,_val); } }

  public static void addAllassigns(Collection schedule_s,Assignment _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().addassigns(schedule_x, _val); } }


  public static void removeAllassigns(Collection schedule_s,Assignment _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().removeassigns(schedule_x, _val); } }


  public static void unionAllassigns(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().unionassigns(schedule_x, _val); } }


  public static void subtractAllassigns(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().subtractassigns(schedule_x, _val); } }


  public void setsortedStaff(ArrayList sortedStaff_xx) { sortedStaff = sortedStaff_xx;
    }
 
  public void setsortedStaff(int ind_x, Staff sortedStaff_xx) { sortedStaff.set(ind_x, sortedStaff_xx); }

 public void addsortedStaff(Staff sortedStaff_xx) { sortedStaff.add(sortedStaff_xx);
    }
 
  public void removesortedStaff(Staff sortedStaff_xx) { sortedStaff.remove(sortedStaff_xx);
    }

  public static void setAllsortedStaff(Collection schedule_s,ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setsortedStaff(schedule_x, _val); } }

  public static void setAllsortedStaff(Collection schedule_s,int _ind,Staff _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setsortedStaff(schedule_x,_ind,_val); } }

  public static void addAllsortedStaff(Collection schedule_s,Staff _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().addsortedStaff(schedule_x, _val); } }


  public static void removeAllsortedStaff(Collection schedule_s,Staff _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().removesortedStaff(schedule_x, _val); } }


  public static void unionAllsortedStaff(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().unionsortedStaff(schedule_x, _val); } }


  public static void subtractAllsortedStaff(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().subtractsortedStaff(schedule_x, _val); } }


  public void setsortedTasks(ArrayList sortedTasks_xx) { sortedTasks = sortedTasks_xx;
    }
 
  public void setsortedTasks(int ind_x, Task sortedTasks_xx) { sortedTasks.set(ind_x, sortedTasks_xx); }

 public void addsortedTasks(Task sortedTasks_xx) { sortedTasks.add(sortedTasks_xx);
    }
 
  public void removesortedTasks(Task sortedTasks_xx) { sortedTasks.remove(sortedTasks_xx);
    }

  public static void setAllsortedTasks(Collection schedule_s,ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setsortedTasks(schedule_x, _val); } }

  public static void setAllsortedTasks(Collection schedule_s,int _ind,Task _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().setsortedTasks(schedule_x,_ind,_val); } }

  public static void addAllsortedTasks(Collection schedule_s,Task _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().addsortedTasks(schedule_x, _val); } }


  public static void removeAllsortedTasks(Collection schedule_s,Task _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().removesortedTasks(schedule_x, _val); } }


  public static void unionAllsortedTasks(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().unionsortedTasks(schedule_x, _val); } }


  public static void subtractAllsortedTasks(Collection schedule_s, ArrayList _val)
  { for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      Controller.inst().subtractsortedTasks(schedule_x, _val); } }


    public int gettotalCost() { return totalCost; }

    public static HashSet getAlltotalCost(Collection schedule_s)
  { HashSet result = new HashSet();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.add(new Integer(schedule_x.gettotalCost())); }
    return result; }

    public static ArrayList getAllOrderedtotalCost(Collection schedule_s)
  { ArrayList result = new ArrayList();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.add(new Integer(schedule_x.gettotalCost())); } 
    return result; }

  public ArrayList getassigns() { return (ArrayList) ((ArrayList) assigns).clone(); }

  public static HashSet getAllassigns(Collection schedule_s)
  { HashSet result = new HashSet();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getassigns()); }
    return result; }

  public static ArrayList getAllOrderedassigns(Collection schedule_s)
  { ArrayList result = new ArrayList();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getassigns()); }
    return result; }

  public ArrayList getsortedStaff() { return (ArrayList) ((ArrayList) sortedStaff).clone(); }

  public static HashSet getAllsortedStaff(Collection schedule_s)
  { HashSet result = new HashSet();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getsortedStaff()); }
    return result; }

  public static ArrayList getAllOrderedsortedStaff(Collection schedule_s)
  { ArrayList result = new ArrayList();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getsortedStaff()); }
    return result; }

  public ArrayList getsortedTasks() { return (ArrayList) ((ArrayList) sortedTasks).clone(); }

  public static HashSet getAllsortedTasks(Collection schedule_s)
  { HashSet result = new HashSet();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getsortedTasks()); }
    return result; }

  public static ArrayList getAllOrderedsortedTasks(Collection schedule_s)
  { ArrayList result = new ArrayList();
    for (Object _o : schedule_s)
    { Schedule schedule_x = (Schedule) _o;
      result.addAll(schedule_x.getsortedTasks()); }
    return result; }

    public ArrayList displaySchedule()
  {   ArrayList result = new ArrayList();
  
  
    return result;
  }


    public int calculateCost()
  {   int result = 0;
  
  
    return result;
  }


    public int sum()
  {   int result = 0;
{}
  return result;

  }


}


class AllocateStaff
  implements SystemTypes
{

  public AllocateStaff()
  {

  }



  public String toString()
  { String _res_ = "(AllocateStaff) ";
    return _res_;
  }


}


class DisplaySchedule
  implements SystemTypes
{

  public DisplaySchedule()
  {

  }



  public String toString()
  { String _res_ = "(DisplaySchedule) ";
    return _res_;
  }


}


class Init
  implements SystemTypes
{

  public Init()
  {

  }



  public String toString()
  { String _res_ = "(Init) ";
    return _res_;
  }


}


class CalculateCost
  implements SystemTypes
{

  public CalculateCost()
  {

  }



  public String toString()
  { String _res_ = "(CalculateCost) ";
    return _res_;
  }


}



public class Controller implements SystemTypes
{
  ArrayList skills = new ArrayList();
  Map skillskillIdindex = new HashMap(); // String --> Skill

  ArrayList staffs = new ArrayList();
  Map staffstaffIdindex = new HashMap(); // String --> Staff

  ArrayList tasks = new ArrayList();
  Map tasktaskIdindex = new HashMap(); // String --> Task

  ArrayList assignments = new ArrayList();
  ArrayList storys = new ArrayList();
  Map storystoryIdindex = new HashMap(); // String --> Story

  ArrayList schedules = new ArrayList();
  ArrayList allocatestaffs = new ArrayList();
  ArrayList displayschedules = new ArrayList();
  ArrayList inits = new ArrayList();
  ArrayList calculatecosts = new ArrayList();
  private static Controller uniqueInstance; 


  private Controller() { } 


  public static Controller inst() 
    { if (uniqueInstance == null) 
    { uniqueInstance = new Controller(); }
    return uniqueInstance; } 


  public static void loadModel(String file)
  {
    try
    { BufferedReader br = null;
      File f = new File(file);
      try 
      { br = new BufferedReader(new FileReader(f)); }
      catch (Exception ex) 
      { System.err.println("No file: " + file); return; }
      Class cont = Class.forName("Controller");
      java.util.Map objectmap = new java.util.HashMap();
      while (true)
      { String line1;
        try { line1 = br.readLine(); }
        catch (Exception e)
        { return; }
        if (line1 == null)
        { return; }
        line1 = line1.trim();

        if (line1.length() == 0) { continue; }
        String left;
        String op;
        String right;
        if (line1.charAt(line1.length() - 1) == '"')
        { int eqind = line1.indexOf("="); 
          if (eqind == -1) { continue; }
          else 
          { left = line1.substring(0,eqind-1).trim();
            op = "="; 
            right = line1.substring(eqind+1,line1.length()).trim();
          }
        }
        else
        { StringTokenizer st1 = new StringTokenizer(line1);
          Vector vals1 = new Vector();
          while (st1.hasMoreTokens())
          { String val1 = st1.nextToken();
            vals1.add(val1);
          }
          if (vals1.size() < 3)
          { continue; }
          left = (String) vals1.get(0);
          op = (String) vals1.get(1);
          right = (String) vals1.get(2);
        }
        if (":".equals(op))
        { int i2 = right.indexOf(".");
          if (i2 == -1)
          { Class cl;
            try { cl = Class.forName("" + right); }
            catch (Exception _x) { System.err.println("No entity: " + right); continue; }
            Object xinst = cl.newInstance();
            objectmap.put(left,xinst);
            Class[] cargs = new Class[] { cl };
            Method addC = cont.getMethod("add" + right,cargs);
            if (addC == null) { continue; }
            Object[] args = new Object[] { xinst };
            addC.invoke(Controller.inst(),args);
          }
          else
          { String obj = right.substring(0,i2);
            String role = right.substring(i2+1,right.length());
            Object objinst = objectmap.get(obj); 
            if (objinst == null) 
            { continue; }
            Object val = objectmap.get(left);
            if (val == null) 
            { continue; }
            Class objC = objinst.getClass();
            Class typeclass = val.getClass(); 
            Object[] args = new Object[] { val }; 
            Class[] settypes = new Class[] { typeclass };
            Method addrole = Controller.findMethod(objC,"add" + role);
            if (addrole != null) 
            { addrole.invoke(objinst, args); }
            else { System.err.println("Error: cannot add to " + role); }
          }
        }
        else if ("=".equals(op))
        { int i1 = left.indexOf(".");
          if (i1 == -1) 
          { continue; }
          String obj = left.substring(0,i1);
          String att = left.substring(i1+1,left.length());
          Object objinst = objectmap.get(obj); 
          if (objinst == null) 
          { continue; }
          Class objC = objinst.getClass();
          Class typeclass; 
          Object val; 
          if (right.charAt(0) == '"' &&
              right.charAt(right.length() - 1) == '"')
          { typeclass = String.class;
            val = right.substring(1,right.length() - 1);
          } 
          else if ("true".equals(right) || "false".equals(right))
          { typeclass = boolean.class;
            if ("true".equals(right))
            { val = new Boolean(true); }
            else
            { val = new Boolean(false); }
          }
          else 
          { val = objectmap.get(right);
            if (val != null)
            { typeclass = val.getClass(); }
            else 
            { int i;
              long l; 
              double d;
              try 
              { i = Integer.parseInt(right);
                typeclass = int.class;
                val = new Integer(i); 
              }
              catch (Exception ee)
              { try 
                { l = Long.parseLong(right);
                  typeclass = long.class;
                  val = new Long(l); 
                }
                catch (Exception eee)
                { try
                  { d = Double.parseDouble(right);
                    typeclass = double.class;
                    val = new Double(d);
                  }
                  catch (Exception ff)
                  { continue; }
                }
              }
            }
          }
          Object[] args = new Object[] { val }; 
          Class[] settypes = new Class[] { typeclass };
          Method setatt = Controller.findMethod(objC,"set" + att);
          if (setatt != null) 
          { setatt.invoke(objinst, args); }
          else { System.err.println("No attribute: " + att); }
        }
      }
    } catch (Exception e) { }
  }

  public static Method findMethod(Class c, String name)
  { Method[] mets = c.getMethods(); 
    for (int i = 0; i < mets.length; i++)
    { Method m = mets[i];
      if (m.getName().equals(name))
      { return m; }
    } 
    return null;
  }


  public void saveModel(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
  for (int _i = 0; _i < skills.size(); _i++)
  { Skill skillx_ = (Skill) skills.get(_i);
    out.println("skillx_" + _i + " : Skill");
    out.println("skillx_" + _i + ".skillId = \"" + skillx_.getskillId() + "\"");
  }

  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    out.println("staffx_" + _i + " : Staff");
    out.println("staffx_" + _i + ".staffId = \"" + staffx_.getstaffId() + "\"");
    out.println("staffx_" + _i + ".costDay = " + staffx_.getcostDay());
  }

  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    out.println("taskx_" + _i + " : Task");
    out.println("taskx_" + _i + ".taskId = \"" + taskx_.gettaskId() + "\"");
    out.println("taskx_" + _i + ".duration = " + taskx_.getduration());
  }

  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + " : Assignment");
  }

  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    out.println("storyx_" + _i + " : Story");
    out.println("storyx_" + _i + ".storyId = \"" + storyx_.getstoryId() + "\"");
  }

  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    out.println("schedulex_" + _i + " : Schedule");
    out.println("schedulex_" + _i + ".totalCost = " + schedulex_.gettotalCost());
  }

  for (int _i = 0; _i < allocatestaffs.size(); _i++)
  { AllocateStaff allocatestaffx_ = (AllocateStaff) allocatestaffs.get(_i);
    out.println("allocatestaffx_" + _i + " : AllocateStaff");
  }

  for (int _i = 0; _i < displayschedules.size(); _i++)
  { DisplaySchedule displayschedulex_ = (DisplaySchedule) displayschedules.get(_i);
    out.println("displayschedulex_" + _i + " : DisplaySchedule");
  }

  for (int _i = 0; _i < inits.size(); _i++)
  { Init initx_ = (Init) inits.get(_i);
    out.println("initx_" + _i + " : Init");
  }

  for (int _i = 0; _i < calculatecosts.size(); _i++)
  { CalculateCost calculatecostx_ = (CalculateCost) calculatecosts.get(_i);
    out.println("calculatecostx_" + _i + " : CalculateCost");
  }

  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    Collection staff_completes_Assignment = staffx_.getcompletes();
    for (Object _j : staff_completes_Assignment)
    { out.println("assignmentx_" + assignments.indexOf(_j) + " : staffx_" + _i + ".completes");
    }
    Collection staff_has_Skill = staffx_.gethas();
    for (Object _j : staff_has_Skill)
    { out.println("skillx_" + skills.indexOf(_j) + " : staffx_" + _i + ".has");
    }
  }
  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    Collection task_needs_Skill = taskx_.getneeds();
    for (Object _j : task_needs_Skill)
    { out.println("skillx_" + skills.indexOf(_j) + " : taskx_" + _i + ".needs");
    }
    Collection task_completes_Assignment = taskx_.getcompletes();
    for (Object _j : task_completes_Assignment)
    { out.println("assignmentx_" + assignments.indexOf(_j) + " : taskx_" + _i + ".completes");
    }
    Collection task_dependsOn_Task = taskx_.getdependsOn();
    for (Object _j : task_dependsOn_Task)
    { out.println("taskx_" + tasks.indexOf(_j) + " : taskx_" + _i + ".dependsOn");
    }
    out.println("taskx_" + _i + ".subTask = taskx_" + tasks.indexOf(((Task) tasks.get(_i)).getsubTask()));
  }
  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + ".assigned = staffx_" + staffs.indexOf(((Assignment) assignments.get(_i)).getassigned()));
    out.println("assignmentx_" + _i + ".assignedTo = taskx_" + tasks.indexOf(((Assignment) assignments.get(_i)).getassignedTo()));
  }
  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    Collection story_subtasks_Task = storyx_.getsubtasks();
    for (Object _j : story_subtasks_Task)
    { out.println("taskx_" + tasks.indexOf(_j) + " : storyx_" + _i + ".subtasks");
    }
  }
  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    Collection schedule_assigns_Assignment = schedulex_.getassigns();
    for (Object _j : schedule_assigns_Assignment)
    { out.println("assignmentx_" + assignments.indexOf(_j) + " : schedulex_" + _i + ".assigns");
    }
    Collection schedule_sortedStaff_Staff = schedulex_.getsortedStaff();
    for (Object _j : schedule_sortedStaff_Staff)
    { out.println("staffx_" + staffs.indexOf(_j) + " : schedulex_" + _i + ".sortedStaff");
    }
    Collection schedule_sortedTasks_Task = schedulex_.getsortedTasks();
    for (Object _j : schedule_sortedTasks_Task)
    { out.println("taskx_" + tasks.indexOf(_j) + " : schedulex_" + _i + ".sortedTasks");
    }
  }
    out.close(); 
  }



  public void addSkill(Skill oo) { skills.add(oo); }

  public Skill getSkillByPK(String skillId_x)
  {  return (Skill) skillskillIdindex.get(skillId_x); }

  public HashSet getSkillByPK(HashSet skillId_x)
  { HashSet res = new HashSet(); 
    for (Object _o : skillId_x)
    { Skill skill_x = getSkillByPK((String) _o);
      if (skill_x != null) { res.add(skill_x); }
    }
    return res; 
  }

  public ArrayList getSkillByPK(ArrayList skillId_x)
  { ArrayList res = new ArrayList(); 
    for (int _i = 0; _i < skillId_x.size(); _i++)
    { Skill Skillx = getSkillByPK((String) skillId_x.get(_i));
      if (Skillx != null) { res.add(Skillx); }
    }
    return res; 
  }

  public void addStaff(Staff oo) { staffs.add(oo); }

  public Staff getStaffByPK(String staffId_x)
  {  return (Staff) staffstaffIdindex.get(staffId_x); }

  public HashSet getStaffByPK(HashSet staffId_x)
  { HashSet res = new HashSet(); 
    for (Object _o : staffId_x)
    { Staff staff_x = getStaffByPK((String) _o);
      if (staff_x != null) { res.add(staff_x); }
    }
    return res; 
  }

  public ArrayList getStaffByPK(ArrayList staffId_x)
  { ArrayList res = new ArrayList(); 
    for (int _i = 0; _i < staffId_x.size(); _i++)
    { Staff Staffx = getStaffByPK((String) staffId_x.get(_i));
      if (Staffx != null) { res.add(Staffx); }
    }
    return res; 
  }

  public void addTask(Task oo) { tasks.add(oo); }

  public Task getTaskByPK(String taskId_x)
  {  return (Task) tasktaskIdindex.get(taskId_x); }

  public HashSet getTaskByPK(HashSet taskId_x)
  { HashSet res = new HashSet(); 
    for (Object _o : taskId_x)
    { Task task_x = getTaskByPK((String) _o);
      if (task_x != null) { res.add(task_x); }
    }
    return res; 
  }

  public ArrayList getTaskByPK(ArrayList taskId_x)
  { ArrayList res = new ArrayList(); 
    for (int _i = 0; _i < taskId_x.size(); _i++)
    { Task Taskx = getTaskByPK((String) taskId_x.get(_i));
      if (Taskx != null) { res.add(Taskx); }
    }
    return res; 
  }

  public void addAssignment(Assignment oo) { assignments.add(oo); }

  public void addStory(Story oo) { storys.add(oo); }

  public Story getStoryByPK(String storyId_x)
  {  return (Story) storystoryIdindex.get(storyId_x); }

  public HashSet getStoryByPK(HashSet storyId_x)
  { HashSet res = new HashSet(); 
    for (Object _o : storyId_x)
    { Story story_x = getStoryByPK((String) _o);
      if (story_x != null) { res.add(story_x); }
    }
    return res; 
  }

  public ArrayList getStoryByPK(ArrayList storyId_x)
  { ArrayList res = new ArrayList(); 
    for (int _i = 0; _i < storyId_x.size(); _i++)
    { Story Storyx = getStoryByPK((String) storyId_x.get(_i));
      if (Storyx != null) { res.add(Storyx); }
    }
    return res; 
  }

  public void addSchedule(Schedule oo) { schedules.add(oo); }

  public void addAllocateStaff(AllocateStaff oo) { allocatestaffs.add(oo); }

  public void addDisplaySchedule(DisplaySchedule oo) { displayschedules.add(oo); }

  public void addInit(Init oo) { inits.add(oo); }

  public void addCalculateCost(CalculateCost oo) { calculatecosts.add(oo); }



  public void createAllSkill(ArrayList skillx)
  { for (int i = 0; i < skillx.size(); i++)
    { Skill skillx_x = new Skill();
      skillx.set(i,skillx_x);
      addSkill(skillx_x);
    }
  }


  public Skill createSkill(String skillIdx)
  { 
    if (skillskillIdindex.get(skillIdx) != null) { return null; }
    Skill skillx = new Skill();
    addSkill(skillx);
    setskillId(skillx,skillIdx);
    skillskillIdindex.put(skillIdx,skillx);

    return skillx;
  }

  public void createAllStaff(ArrayList staffx)
  { for (int i = 0; i < staffx.size(); i++)
    { Staff staffx_x = new Staff();
      staffx.set(i,staffx_x);
      addStaff(staffx_x);
    }
  }


  public Staff createStaff(String staffIdx)
  { 
    if (staffstaffIdindex.get(staffIdx) != null) { return null; }
    Staff staffx = new Staff();
    addStaff(staffx);
    setstaffId(staffx,staffIdx);
    setcostDay(staffx,0);
    setcompletes(staffx,new HashSet());
    sethas(staffx,new HashSet());
    staffstaffIdindex.put(staffIdx,staffx);

    return staffx;
  }

  public void createAllTask(ArrayList taskx)
  { for (int i = 0; i < taskx.size(); i++)
    { Task taskx_x = new Task();
      taskx.set(i,taskx_x);
      addTask(taskx_x);
    }
  }


  public Task createTask(String taskIdx,Task subTaskx)
  { 
    if (tasktaskIdindex.get(taskIdx) != null) { return null; }
    Task taskx = new Task(subTaskx);
    addTask(taskx);
    settaskId(taskx,taskIdx);
    setduration(taskx,0);
    setneeds(taskx,new HashSet());
    setcompletes(taskx,new HashSet());
    setdependsOn(taskx,new HashSet());
    setsubTask(taskx,subTaskx);
    tasktaskIdindex.put(taskIdx,taskx);

    return taskx;
  }

  public void createAllAssignment(ArrayList assignmentx)
  { for (int i = 0; i < assignmentx.size(); i++)
    { Assignment assignmentx_x = new Assignment();
      assignmentx.set(i,assignmentx_x);
      addAssignment(assignmentx_x);
    }
  }


  public Assignment createAssignment(Staff assignedx,Task assignedTox)
  { 
    Assignment assignmentx = new Assignment(assignedx,assignedTox);
    addAssignment(assignmentx);
    setassigned(assignmentx,assignedx);
    setassignedTo(assignmentx,assignedTox);

    return assignmentx;
  }

  public void createAllStory(ArrayList storyx)
  { for (int i = 0; i < storyx.size(); i++)
    { Story storyx_x = new Story();
      storyx.set(i,storyx_x);
      addStory(storyx_x);
    }
  }


  public Story createStory(String storyIdx)
  { 
    if (storystoryIdindex.get(storyIdx) != null) { return null; }
    Story storyx = new Story();
    addStory(storyx);
    setstoryId(storyx,storyIdx);
    setsubtasks(storyx,new ArrayList());
    storystoryIdindex.put(storyIdx,storyx);

    return storyx;
  }

  public void createAllSchedule(ArrayList schedulex)
  { for (int i = 0; i < schedulex.size(); i++)
    { Schedule schedulex_x = new Schedule();
      schedulex.set(i,schedulex_x);
      addSchedule(schedulex_x);
    }
  }


  public Schedule createSchedule()
  { 
    Schedule schedulex = new Schedule();
    addSchedule(schedulex);
    settotalCost(schedulex,0);
    setassigns(schedulex,new ArrayList());
    setsortedStaff(schedulex,new ArrayList());
    setsortedTasks(schedulex,new ArrayList());

    return schedulex;
  }

  public void createAllAllocateStaff(ArrayList allocatestaffx)
  { for (int i = 0; i < allocatestaffx.size(); i++)
    { AllocateStaff allocatestaffx_x = new AllocateStaff();
      allocatestaffx.set(i,allocatestaffx_x);
      addAllocateStaff(allocatestaffx_x);
    }
  }


  public AllocateStaff createAllocateStaff()
  { 
    AllocateStaff allocatestaffx = new AllocateStaff();
    addAllocateStaff(allocatestaffx);

    return allocatestaffx;
  }

  public void createAllDisplaySchedule(ArrayList displayschedulex)
  { for (int i = 0; i < displayschedulex.size(); i++)
    { DisplaySchedule displayschedulex_x = new DisplaySchedule();
      displayschedulex.set(i,displayschedulex_x);
      addDisplaySchedule(displayschedulex_x);
    }
  }


  public DisplaySchedule createDisplaySchedule()
  { 
    DisplaySchedule displayschedulex = new DisplaySchedule();
    addDisplaySchedule(displayschedulex);

    return displayschedulex;
  }

  public void createAllInit(ArrayList initx)
  { for (int i = 0; i < initx.size(); i++)
    { Init initx_x = new Init();
      initx.set(i,initx_x);
      addInit(initx_x);
    }
  }


  public Init createInit()
  { 
    Init initx = new Init();
    addInit(initx);

    return initx;
  }

  public void createAllCalculateCost(ArrayList calculatecostx)
  { for (int i = 0; i < calculatecostx.size(); i++)
    { CalculateCost calculatecostx_x = new CalculateCost();
      calculatecostx.set(i,calculatecostx_x);
      addCalculateCost(calculatecostx_x);
    }
  }


  public CalculateCost createCalculateCost()
  { 
    CalculateCost calculatecostx = new CalculateCost();
    addCalculateCost(calculatecostx);

    return calculatecostx;
  }


public void setskillId(Skill skillx, String skillId_x) 
  { if (skillskillIdindex.get(skillId_x) != null) { return; }
  skillskillIdindex.remove(skillx.getskillId());
  skillx.setskillId(skillId_x);
  skillskillIdindex.put(skillId_x,skillx);
    }


public void setstaffId(Staff staffx, String staffId_x) 
  { if (staffstaffIdindex.get(staffId_x) != null) { return; }
  staffstaffIdindex.remove(staffx.getstaffId());
  staffx.setstaffId(staffId_x);
  staffstaffIdindex.put(staffId_x,staffx);
    }


public void setcostDay(Staff staffx, int costDay_x) 
  { staffx.setcostDay(costDay_x);
    }


  public void setcompletes(Staff staffx, HashSet completesxx) 
  {   HashSet _oldcompletesxx = staffx.getcompletes();
    for (Object _o : _oldcompletesxx)
    { Assignment _yy = (Assignment) _o;
      if (completesxx.contains(_yy)) { }
      else { _yy.setassigned(null); }
    }
  for (Object _o : completesxx)
  { Assignment _xx = (Assignment) _o;
    if (_oldcompletesxx.contains(_xx)) { }
    else { if (_xx.getassigned() != null) { _xx.getassigned().removecompletes(_xx); }  }
    _xx.setassigned(staffx);
  }
    staffx.setcompletes(completesxx);
      }


  public void addcompletes(Staff staffx, Assignment completesxx) 
  { if (staffx.getcompletes().contains(completesxx)) { return; }
    if (completesxx.getassigned() != null) { completesxx.getassigned().removecompletes(completesxx); }
  completesxx.setassigned(staffx);
    staffx.addcompletes(completesxx);
    }


  public void removecompletes(Staff staffx, Assignment completesxx) 
  { staffx.removecompletes(completesxx);
    completesxx.setassigned(null);
  }


 public void unioncompletes(Staff staffx, Collection completesx)
  { for (Object _o : completesx)
    { Assignment assignmentxcompletes = (Assignment) _o;
      addcompletes(staffx,assignmentxcompletes);
     } } 


 public void subtractcompletes(Staff staffx, Collection completesx)
  { for (Object _o : completesx)
    { Assignment assignmentxcompletes = (Assignment) _o;
      removecompletes(staffx,assignmentxcompletes);
     } } 


  public void sethas(Staff staffx, HashSet hasxx) 
  {     staffx.sethas(hasxx);
      }


  public void addhas(Staff staffx, Skill hasxx) 
  { if (staffx.gethas().contains(hasxx)) { return; }
      staffx.addhas(hasxx);
    }


  public void removehas(Staff staffx, Skill hasxx) 
  { staffx.removehas(hasxx);
    }


 public void unionhas(Staff staffx, Collection hasx)
  { for (Object _o : hasx)
    { Skill skillxhas = (Skill) _o;
      addhas(staffx,skillxhas);
     } } 


 public void subtracthas(Staff staffx, Collection hasx)
  { for (Object _o : hasx)
    { Skill skillxhas = (Skill) _o;
      removehas(staffx,skillxhas);
     } } 


public void settaskId(Task taskx, String taskId_x) 
  { if (tasktaskIdindex.get(taskId_x) != null) { return; }
  tasktaskIdindex.remove(taskx.gettaskId());
  taskx.settaskId(taskId_x);
  tasktaskIdindex.put(taskId_x,taskx);
    }


public void setduration(Task taskx, int duration_x) 
  { taskx.setduration(duration_x);
    }


  public void setneeds(Task taskx, HashSet needsxx) 
  {     taskx.setneeds(needsxx);
      }


  public void addneeds(Task taskx, Skill needsxx) 
  { if (taskx.getneeds().contains(needsxx)) { return; }
      taskx.addneeds(needsxx);
    }


  public void removeneeds(Task taskx, Skill needsxx) 
  { taskx.removeneeds(needsxx);
    }


 public void unionneeds(Task taskx, Collection needsx)
  { for (Object _o : needsx)
    { Skill skillxneeds = (Skill) _o;
      addneeds(taskx,skillxneeds);
     } } 


 public void subtractneeds(Task taskx, Collection needsx)
  { for (Object _o : needsx)
    { Skill skillxneeds = (Skill) _o;
      removeneeds(taskx,skillxneeds);
     } } 


  public void setcompletes(Task taskx, HashSet completesxx) 
  {   HashSet _oldcompletesxx = taskx.getcompletes();
    for (Object _o : _oldcompletesxx)
    { Assignment _yy = (Assignment) _o;
      if (completesxx.contains(_yy)) { }
      else { _yy.setassignedTo(null); }
    }
  for (Object _o : completesxx)
  { Assignment _xx = (Assignment) _o;
    if (_oldcompletesxx.contains(_xx)) { }
    else { if (_xx.getassignedTo() != null) { _xx.getassignedTo().removecompletes(_xx); }  }
    _xx.setassignedTo(taskx);
  }
    taskx.setcompletes(completesxx);
      }


  public void addcompletes(Task taskx, Assignment completesxx) 
  { if (taskx.getcompletes().contains(completesxx)) { return; }
    if (completesxx.getassignedTo() != null) { completesxx.getassignedTo().removecompletes(completesxx); }
  completesxx.setassignedTo(taskx);
    taskx.addcompletes(completesxx);
    }


  public void removecompletes(Task taskx, Assignment completesxx) 
  { taskx.removecompletes(completesxx);
    completesxx.setassignedTo(null);
  }


 public void unioncompletes(Task taskx, Collection completesx)
  { for (Object _o : completesx)
    { Assignment assignmentxcompletes = (Assignment) _o;
      addcompletes(taskx,assignmentxcompletes);
     } } 


 public void subtractcompletes(Task taskx, Collection completesx)
  { for (Object _o : completesx)
    { Assignment assignmentxcompletes = (Assignment) _o;
      removecompletes(taskx,assignmentxcompletes);
     } } 


  public void setdependsOn(Task taskx, HashSet dependsOnxx) 
  {   HashSet _olddependsOnxx = taskx.getdependsOn();
    for (Object _o : _olddependsOnxx)
    { Task _yy = (Task) _o;
      if (dependsOnxx.contains(_yy)) { }
      else { _yy.setsubTask(null); }
    }
  for (Object _o : dependsOnxx)
  { Task _xx = (Task) _o;
    if (_olddependsOnxx.contains(_xx)) { }
    else { if (_xx.getsubTask() != null) { _xx.getsubTask().removedependsOn(_xx); }  }
    _xx.setsubTask(taskx);
  }
    taskx.setdependsOn(dependsOnxx);
      }


  public void adddependsOn(Task taskx, Task dependsOnxx) 
  { if (taskx.getdependsOn().contains(dependsOnxx)) { return; }
    if (dependsOnxx.getsubTask() != null) { dependsOnxx.getsubTask().removedependsOn(dependsOnxx); }
  dependsOnxx.setsubTask(taskx);
    taskx.adddependsOn(dependsOnxx);
    }


  public void removedependsOn(Task taskx, Task dependsOnxx) 
  { taskx.removedependsOn(dependsOnxx);
    dependsOnxx.setsubTask(null);
  }


 public void uniondependsOn(Task taskx, Collection dependsOnx)
  { for (Object _o : dependsOnx)
    { Task taskxdependsOn = (Task) _o;
      adddependsOn(taskx,taskxdependsOn);
     } } 


 public void subtractdependsOn(Task taskx, Collection dependsOnx)
  { for (Object _o : dependsOnx)
    { Task taskxdependsOn = (Task) _o;
      removedependsOn(taskx,taskxdependsOn);
     } } 


  public void setsubTask(Task taskx, Task subTaskxx) 
  {   if (taskx.getsubTask() == subTaskxx) { return; }
    if (taskx.getsubTask() != null)
    { Task old_value = taskx.getsubTask();
      old_value.removedependsOn(taskx); } 
    subTaskxx.adddependsOn(taskx);
    taskx.setsubTask(subTaskxx);
      }


  public void setassigned(Assignment assignmentx, Staff assignedxx) 
  {   if (assignmentx.getassigned() == assignedxx) { return; }
    if (assignmentx.getassigned() != null)
    { Staff old_value = assignmentx.getassigned();
      old_value.removecompletes(assignmentx); } 
    assignedxx.addcompletes(assignmentx);
    assignmentx.setassigned(assignedxx);
      }


  public void setassignedTo(Assignment assignmentx, Task assignedToxx) 
  {   if (assignmentx.getassignedTo() == assignedToxx) { return; }
    if (assignmentx.getassignedTo() != null)
    { Task old_value = assignmentx.getassignedTo();
      old_value.removecompletes(assignmentx); } 
    assignedToxx.addcompletes(assignmentx);
    assignmentx.setassignedTo(assignedToxx);
      }


public void setstoryId(Story storyx, String storyId_x) 
  { if (storystoryIdindex.get(storyId_x) != null) { return; }
  storystoryIdindex.remove(storyx.getstoryId());
  storyx.setstoryId(storyId_x);
  storystoryIdindex.put(storyId_x,storyx);
    }


  public void setsubtasks(Story storyx, ArrayList subtasksxx) 
  {   ArrayList _oldsubtasksxx = storyx.getsubtasks();
  for (Object _o : subtasksxx)
  { Task _xx = (Task) _o;
    if (_oldsubtasksxx.contains(_xx)) { }
    else { Story.removeAllsubtasks(storys, _xx); }
  }
    storyx.setsubtasks(subtasksxx);
      }


  public void setsubtasks(Story storyx, int _ind, Task taskx) 
  { storyx.setsubtasks(_ind,taskx); }
  
  public void addsubtasks(Story storyx, Task subtasksxx) 
  {   Story.removeAllsubtasks(storys,subtasksxx);
    storyx.addsubtasks(subtasksxx);
    }


  public void removesubtasks(Story storyx, Task subtasksxx) 
  { storyx.removesubtasks(subtasksxx);
    }


 public void unionsubtasks(Story storyx, Collection subtasksx)
  { for (Object _o : subtasksx)
    { Task taskxsubtasks = (Task) _o;
      addsubtasks(storyx,taskxsubtasks);
     } } 


 public void subtractsubtasks(Story storyx, Collection subtasksx)
  { for (Object _o : subtasksx)
    { Task taskxsubtasks = (Task) _o;
      removesubtasks(storyx,taskxsubtasks);
     } } 


public void settotalCost(Schedule schedulex, int totalCost_x) 
  { schedulex.settotalCost(totalCost_x);
    }


  public void setassigns(Schedule schedulex, ArrayList assignsxx) 
  {     schedulex.setassigns(assignsxx);
      }


  public void setassigns(Schedule schedulex, int _ind, Assignment assignmentx) 
  { schedulex.setassigns(_ind,assignmentx); }
  
  public void addassigns(Schedule schedulex, Assignment assignsxx) 
  {     schedulex.addassigns(assignsxx);
    }


  public void removeassigns(Schedule schedulex, Assignment assignsxx) 
  { schedulex.removeassigns(assignsxx);
    }


 public void unionassigns(Schedule schedulex, Collection assignsx)
  { for (Object _o : assignsx)
    { Assignment assignmentxassigns = (Assignment) _o;
      addassigns(schedulex,assignmentxassigns);
     } } 


 public void subtractassigns(Schedule schedulex, Collection assignsx)
  { for (Object _o : assignsx)
    { Assignment assignmentxassigns = (Assignment) _o;
      removeassigns(schedulex,assignmentxassigns);
     } } 


  public void setsortedStaff(Schedule schedulex, ArrayList sortedStaffxx) 
  {     schedulex.setsortedStaff(sortedStaffxx);
      }


  public void setsortedStaff(Schedule schedulex, int _ind, Staff staffx) 
  { schedulex.setsortedStaff(_ind,staffx); }
  
  public void addsortedStaff(Schedule schedulex, Staff sortedStaffxx) 
  {     schedulex.addsortedStaff(sortedStaffxx);
    }


  public void removesortedStaff(Schedule schedulex, Staff sortedStaffxx) 
  { schedulex.removesortedStaff(sortedStaffxx);
    }


 public void unionsortedStaff(Schedule schedulex, Collection sortedStaffx)
  { for (Object _o : sortedStaffx)
    { Staff staffxsortedStaff = (Staff) _o;
      addsortedStaff(schedulex,staffxsortedStaff);
     } } 


 public void subtractsortedStaff(Schedule schedulex, Collection sortedStaffx)
  { for (Object _o : sortedStaffx)
    { Staff staffxsortedStaff = (Staff) _o;
      removesortedStaff(schedulex,staffxsortedStaff);
     } } 


  public void setsortedTasks(Schedule schedulex, ArrayList sortedTasksxx) 
  {     schedulex.setsortedTasks(sortedTasksxx);
      }


  public void setsortedTasks(Schedule schedulex, int _ind, Task taskx) 
  { schedulex.setsortedTasks(_ind,taskx); }
  
  public void addsortedTasks(Schedule schedulex, Task sortedTasksxx) 
  {     schedulex.addsortedTasks(sortedTasksxx);
    }


  public void removesortedTasks(Schedule schedulex, Task sortedTasksxx) 
  { schedulex.removesortedTasks(sortedTasksxx);
    }


 public void unionsortedTasks(Schedule schedulex, Collection sortedTasksx)
  { for (Object _o : sortedTasksx)
    { Task taskxsortedTasks = (Task) _o;
      addsortedTasks(schedulex,taskxsortedTasks);
     } } 


 public void subtractsortedTasks(Schedule schedulex, Collection sortedTasksx)
  { for (Object _o : sortedTasksx)
    { Task taskxsortedTasks = (Task) _o;
      removesortedTasks(schedulex,taskxsortedTasks);
     } } 



  public void allocateStaff(Assignment assignmentx)
  {   assignmentx.allocateStaff();
   }

  public  ArrayList AllAssignmentallocateStaff(Collection assignmentxs)
  { 
    ArrayList result = new ArrayList();
    for (Object i : assignmentxs)
    { Assignment assignmentx = (Assignment) i;
      allocateStaff(assignmentx);
    }
    return result; 
  }

  public  ArrayList AllAssignmenttoString(Collection assignmentxs)
  { 
    ArrayList result = new ArrayList();
    for (Object _i : assignmentxs)
    { Assignment assignmentx = (Assignment) _i;
      result.add(assignmentx.toString());
    }
    return result; 
  }

  public int cost(Assignment assignmentx)
  { 
   int result = 0;
   result =   assignmentx.cost();
     return result;  }

  public  ArrayList AllAssignmentcost(Collection assignmentxs)
  { 
    ArrayList result = new ArrayList();
    for (Object i : assignmentxs)
    { Assignment assignmentx = (Assignment) i;
      result.add(new Integer(cost(assignmentx)));
    }
    return result; 
  }

  public  ArrayList AllScheduledisplaySchedule(Collection schedulexs)
  { 
    ArrayList result = new ArrayList();
    for (Object _i : schedulexs)
    { Schedule schedulex = (Schedule) _i;
      result.addAll(schedulex.displaySchedule());
    }
    return result; 
  }

  public  ArrayList AllSchedulecalculateCost(Collection schedulexs)
  { 
    ArrayList result = new ArrayList();
    for (Object _i : schedulexs)
    { Schedule schedulex = (Schedule) _i;
      result.add(new Integer(schedulex.calculateCost()));
    }
    return result; 
  }

  public int sum(Schedule schedulex)
  { 
   int result = 0;
   result =   schedulex.sum();
     return result;  }

  public  ArrayList AllSchedulesum(Collection schedulexs)
  { 
    ArrayList result = new ArrayList();
    for (Object i : schedulexs)
    { Schedule schedulex = (Schedule) i;
      result.add(new Integer(sum(schedulex)));
    }
    return result; 
  }



  public void killAllSkill(Collection skillxx)
  { for (Object _o : skillxx)
    { killSkill((Skill) _o); }
  }

  public void killSkill(Skill skillxx)
  { skills.remove(skillxx);
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    ArrayList _1qrangeneedsTask = new ArrayList();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    ArrayList _1qrangehasStaff = new ArrayList();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    skillskillIdindex.remove(skillxx.getskillId());
  }



  public void killAllStaff(Collection staffxx)
  { for (Object _o : staffxx)
    { killStaff((Staff) _o); }
  }

  public void killStaff(Staff staffxx)
  { staffs.remove(staffxx);
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2removedassignedAssignment = new ArrayList();
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    ArrayList _2qrangeassignedAssignment = new ArrayList();
    _2qrangeassignedAssignment.addAll(staffxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassigned()))
      { _2removedassignedAssignment.add(assignmentx);
        assignmentx.setassigned(null);
      }
    }

    staffxx.setcompletes(new HashSet());
    ArrayList _1qrangesortedStaffSchedule = new ArrayList();
    _1qrangesortedStaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedStaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedStaffSchedule.get(_i);
      if (schedulex.getsortedStaff().contains(staffxx))
      { removesortedStaff(schedulex,staffxx); }
    }
    staffstaffIdindex.remove(staffxx.getstaffId());
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedassignedAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedAssignment.get(_i)); }
  }



  public void killAllTask(Collection taskxx)
  { for (Object _o : taskxx)
    { killTask((Task) _o); }
  }

  public void killTask(Task taskxx)
  { tasks.remove(taskxx);
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2removedassignedToAssignment = new ArrayList();
    ArrayList _2removedsubTaskTask = new ArrayList();
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    ArrayList _2qrangeassignedToAssignment = new ArrayList();
    _2qrangeassignedToAssignment.addAll(taskxx.getcompletes());
    for (int _i = 0; _i < _2qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _2qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedTo()))
      { _2removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }

    taskxx.setcompletes(new HashSet());
    ArrayList _1qrangesubtasksStory = new ArrayList();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    ArrayList _1qrangedependsOnTask = new ArrayList();
    _1qrangedependsOnTask.add(taskxx.getsubTask());
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    ArrayList _2qrangesubTaskTask = new ArrayList();
    _2qrangesubTaskTask.addAll(taskxx.getdependsOn());
    for (int _i = 0; _i < _2qrangesubTaskTask.size(); _i++)
    { Task taskx = (Task) _2qrangesubTaskTask.get(_i);
      if (taskx != null && taskxx.equals(taskx.getsubTask()))
      { _2removedsubTaskTask.add(taskx);
        taskx.setsubTask(null);
      }
    }

    taskxx.setdependsOn(new HashSet());
    ArrayList _1qrangesortedTasksSchedule = new ArrayList();
    _1qrangesortedTasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedTasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedTasksSchedule.get(_i);
      if (schedulex.getsortedTasks().contains(taskxx))
      { removesortedTasks(schedulex,taskxx); }
    }
    tasktaskIdindex.remove(taskxx.gettaskId());
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
    for (int _i = 0; _i < _2removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _2removedassignedToAssignment.get(_i)); }
    for (int _i = 0; _i < _2removedsubTaskTask.size(); _i++)
    { killTask((Task) _2removedsubTaskTask.get(_i)); }
  }



  public void killAllAssignment(Collection assignmentxx)
  { for (Object _o : assignmentxx)
    { killAssignment((Assignment) _o); }
  }

  public void killAssignment(Assignment assignmentxx)
  { assignments.remove(assignmentxx);
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
    ArrayList _1qrangecompletesStaff = new ArrayList();
    _1qrangecompletesStaff.add(assignmentxx.getassigned());
    for (int _i = 0; _i < _1qrangecompletesStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangecompletesStaff.get(_i);
      if (staffx.getcompletes().contains(assignmentxx))
      { removecompletes(staffx,assignmentxx); }
    }
    ArrayList _1qrangecompletesTask = new ArrayList();
    _1qrangecompletesTask.add(assignmentxx.getassignedTo());
    for (int _i = 0; _i < _1qrangecompletesTask.size(); _i++)
    { Task taskx = (Task) _1qrangecompletesTask.get(_i);
      if (taskx.getcompletes().contains(assignmentxx))
      { removecompletes(taskx,assignmentxx); }
    }
    ArrayList _1qrangeassignsSchedule = new ArrayList();
    _1qrangeassignsSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignsSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignsSchedule.get(_i);
      if (schedulex.getassigns().contains(assignmentxx))
      { removeassigns(schedulex,assignmentxx); }
    }
  }



  public void killAllStory(Collection storyxx)
  { for (Object _o : storyxx)
    { killStory((Story) _o); }
  }

  public void killStory(Story storyxx)
  { storys.remove(storyxx);
    storystoryIdindex.remove(storyxx.getstoryId());
  }



  public void killAllSchedule(Collection schedulexx)
  { for (Object _o : schedulexx)
    { killSchedule((Schedule) _o); }
  }

  public void killSchedule(Schedule schedulexx)
  { schedules.remove(schedulexx);
  }



  public void killAllAllocateStaff(Collection allocatestaffxx)
  { for (Object _o : allocatestaffxx)
    { killAllocateStaff((AllocateStaff) _o); }
  }

  public void killAllocateStaff(AllocateStaff allocatestaffxx)
  { allocatestaffs.remove(allocatestaffxx);
  }



  public void killAllDisplaySchedule(Collection displayschedulexx)
  { for (Object _o : displayschedulexx)
    { killDisplaySchedule((DisplaySchedule) _o); }
  }

  public void killDisplaySchedule(DisplaySchedule displayschedulexx)
  { displayschedules.remove(displayschedulexx);
  }



  public void killAllInit(Collection initxx)
  { for (Object _o : initxx)
    { killInit((Init) _o); }
  }

  public void killInit(Init initxx)
  { inits.remove(initxx);
  }



  public void killAllCalculateCost(Collection calculatecostxx)
  { for (Object _o : calculatecostxx)
    { killCalculateCost((CalculateCost) _o); }
  }

  public void killCalculateCost(CalculateCost calculatecostxx)
  { calculatecosts.remove(calculatecostxx);
  }




  
    public void allocateStaff() 
  { 

  
  }



    public void displaySchedule() 
  { 

  
  }



    public void init() 
  { 

  
  }



    public void calculateCost() 
  { 

  
  }


 
}


