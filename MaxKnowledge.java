import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxKnowledge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String topic[] = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}

		int max_topics = 0;
		int count = 0;
		int max_teams = n * (n - 1) / 2 + 1;
		int team_knowledge[] = new int[max_teams];
		int team_counter = 0;
		
		for(int k=0;k<n-1;k++)
		{
		for (int i = k+1; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {

				if (topic[k].charAt(j) == '1' || topic[i].charAt(j)=='1')
					count++;				
			}
			team_knowledge[team_counter++] = count;
			//System.out.println(i+" "+(i+1)+" "+team_knowledge[team_counter-1]);
			if (count > max_topics)
				max_topics = count;
		}}
		team_counter = 0;
		for (int i = 0; i < team_knowledge.length; i++)
			if (team_knowledge[i] == max_topics)
				team_counter++;
		System.out.println(max_topics);
		System.out.println(team_counter);
	}
}
