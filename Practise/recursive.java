package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Point
{
	int id;
	float x;
	float y;
	double dist;	
	public Point(int id,float x, float y)
	{
		this.id=id;
		this.x=x;
		this.y=y;		
	}		
}

 class distancecomparer implements Comparator<Point>
{
	@Override
	public int compare(Point p1, Point p2) 
	{
		
		double x=p1.dist;
		double y=p2.dist;
		return Double.compare(x, y);		
	}	
}

public class recursive {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			ArrayList<Point> pointlist=new ArrayList<Point>();
			
			while(sc.hasNext())
			{
				String[] tempstore=new String[3];
				String line=sc.nextLine().trim();
				tempstore=line.split("\\s+");
				
				
				int tempid=Integer.valueOf(tempstore[0]);
				float tempx=Float.parseFloat(tempstore[1]);
				float tempy=Float.parseFloat(tempstore[2]);
				Point pnt=new Point(tempid,tempx,tempy);				
				pointlist.add(pnt);					
			}
							
			
			//System.out.println(pointlist.size());
			int max=Integer.MIN_VALUE;
			for(int i=0;i<pointlist.size();i++)
			{		
				Point p1=pointlist.get(i);
				ArrayList<Point> closepoints=new ArrayList<Point>();
				for(int j=0;j<pointlist.size();j++)
				{		
					Point p2=pointlist.get(j);
					if(!(p1.equals(p2)))
					{							
						float xdist=(Math.abs(p1.x-p2.x))*(Math.abs(p1.x-p2.x));
						float ydist=(Math.abs(p1.y-p2.y)*Math.abs(p1.y-p2.y));						
						float totaldist=xdist+ydist;						
						double dist= Math.sqrt(totaldist);						
						p2.dist=dist;
						closepoints.add(p2);																		
					}
					
					}
				
				Collections.sort(closepoints,new distancecomparer());				
				System.out.print(p1.id+"    ");
				for(int a=0;a<3;a++)
				{
					System.out.print(closepoints.get(a).id+",");														
				}
				System.out.println();
				
			}
			
			
			
		}
		catch(Exception ex)
		{
			
			
		}
		
	
		
		
		
		
	}

}
