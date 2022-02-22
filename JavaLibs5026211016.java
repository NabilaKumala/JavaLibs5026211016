package JavaLibs5026211016;

import javax.swing.JOptionPane;

public class JavaLibs5026211016 {
	public static void main(String[] args) {

		String name;
			name = JOptionPane.showInputDialog("HEY, HEY, HEEEEY!! Welcome to NessVille. \n"
								    + "My name is Peter. May I know your name, please?");

		JOptionPane.showInputDialog("Nice to meet you, "+name +". :D \n"
									  + "Where did you came from?");

		double distance;
			distance = Double.parseDouble(JOptionPane.showInputDialog("Ooh.. how many kilometers is it from NessVille?"));
			distance = distance + 4.5;

		int age;
			age = Integer.parseInt(JOptionPane.showInputDialog("I am not a native. I move out from the Owl City 2 years ago. \n"
											  + "It is "+distance +" kilometers from NessVille. \n"
											  + "Anyway, how old are you?"));
			age = age - 2;

		String lunchMenu;
			lunchMenu = JOptionPane.showInputDialog("Ah, I am sorry.. T^T \n"
						   			   + "I thought that you were younger than me. I am "+age +" years old. \n"
						   			   + "Oh, right now we are preparing for lunch. \n"
					   				   + "What would you like to eat for lunch?");

		String animal;
			animal = JOptionPane.showInputDialog("Don't worry, you are the guest here. We just want to welcome you. \n"
									+ "Waiting for the lunch time, why don't we play with some animals there? \n"
									+ "What animal do you think is the cutest?");

		JOptionPane.showInputDialog("OH IT'S THE SAME WITH ME. I love "+animal +" too. \n"
						   + "I have 2 "+animal +"s named Bongji and Bonggu. \n"
						   + "How about sports? Please name a sport you are most confident at.");

		String singer;
			singer = JOptionPane.showInputDialog("Eh, me? I used to be the ace in my volleyball team before. :D \n"
									+ "Ah, I want to play music. Do you have any singer in mind?");
		String song;
			song = JOptionPane.showInputDialog("What is the title of the song by "+singer +"?");

		String opinion;
			opinion = JOptionPane.showInputDialog("OH "+song +" by "+singer +" is a good song! You have good taste in music. \n"
									 + "Anyway, we've been spending pretty much time together for now. \n"
									 + "Please describe your impression of me in one word. I am curious about it.");

		JOptionPane.showMessageDialog(
				null,
				"I am happy to be with you too~ Hey, I think the lunch is ready. The good smell of "+lunchMenu +" can be smell from here :9",
				"Thank you",
				1);

	}
}