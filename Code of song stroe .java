
import java.util.*;
public class Songs
{
    Scanner sc = new Scanner(System.in);
    int initialCapacity =0;
    int numberOfSongs=0;
    public Songs(int store,int numberOfSongs)
    {
        this.initialCapacity = store;
        this.numberOfSongs = numberOfSongs;
    }
public ArrayList<String> defaultList =new ArrayList<String>();
	public static void add_songs()
	{
	    int newSong = 0;
	    do
		{  
	      defaultList.add(sc.next());
	    }
	    while (newSong>=numberOfSongs);   
	}
public ArrayList<String> modifyList = new ArrayList<String>();
	for(int newSong=0;newSong<initialCapacity;newSong++) 
	{
	   modifyList.add(defaultList.get(newSong));
	}
public static ArrayList<String> modify(){
	LinkedList<String> linkedList = new LinkedList<String>();
	System.out.println("select song :");
	for(int newSong=0;newSong<numberOfSongs;newSong++)
	{
	   System.out.println(defaultList.get(newSong));
	}
	String song =sc.next();
	if(song.contains(modifyList))
	{
	            int ind=modifyList.indexOf(song));
	            for(int frontIndex = ind;frontIndex>=0;frontIndex--)
				{
	                linkedList.addFirst(modifyList.get(frontIndex));
	                if(linkedList.size()>=initialCapacity) 
					break;
	            }
	            for(int backIndex =modifyList.size()-1;backIndex>ind;backIndex --)
				{
	                linkedList.addFirst(modifyList.get(frontIndex));
	                if(linkedList.size()>=initialCapacity) 
					break;
				}
	}
	else
	{
	            linkedList.addFirst(modifyList.get(frontIndex));
	            int ind=modifyList.size();
	            for(int frontIndex=ind;frontIndex>=0;frontIndex--)
				{
	                linkedList.addFirst(modifyList.get(frontIndex));
	                if(linkedList.size()>=initialCapacity) break;
	            }
	        }
	        for(int i=0;i<initialCapacity;i++) modifyList.add(linkedList.get(i));
	        return modifyList;
	    }
	}

public class UserOperations extends Songs
{
    public static modify()
    {
       ArrayList<String> editedList = super.modify();
       System.out.print("After");
       for(int i=0;i<editedList.size();i++) System.out.print(editedList.get(i));
    }
	public class Main
	{
    	public static void main(String[] args) 
		{
	        Scanner sc=new Scanner(System.in);
	        int initialCapacity=3;
	        int numberOfSongs = sc.nextInt();
	        int numberOfUsers =sc.nextInt();
	        for(int i=0;i<numberOfUsers;i++)
			{
           Songs song=new Songs(initialCapacity,numberOfSongs); 
           song.add();
           UserOperations uo=new UserOperations();
           uo.modify();
         	}
    	}
	}
} 

