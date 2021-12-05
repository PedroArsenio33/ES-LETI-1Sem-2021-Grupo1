package pt.iscte_iul.ProjetoES_;
import java.io.IOException;

public class Main {
	
	private static GUI gui;

	public static void main(String[] args) throws IOException {
		
		gui.createAndShowGUI();
		
		TrelloMethods trello = new TrelloMethods();
		GithubMethods github = new GithubMethods();
		
		System.out.println("\tConteúdo do README.md:\n" + github.getReadme());
		
		System.out.println("\tTags:");
		for (String tags : github.getTags()) {
        	System.out.println(tags);
        }
		
		System.out.println("\tNome do projeto:\n" + trello.getProjectID());
		
		System.out.println("\tUsername dos membros:");
		for (String names : trello.getProjectMembers()) {
        	System.out.println(names);
        }
		
		System.out.println("\tData do início do projeto:\n" + trello.getProjectStartDate());
		for (String desc : trello.getMeetingDescriptions()) {
        	System.out.println("\t" + desc);
        }
		
		System.out.println("\tItems em cada Sprint:");
		for (String items : trello.getItemsDoneEachSprint()) {
        	System.out.println(items);
        }
	}
	
}
