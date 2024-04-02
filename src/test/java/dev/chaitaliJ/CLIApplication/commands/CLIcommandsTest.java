package dev.chaitaliJ.CLIApplication.commands;



import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


import dev.chaitaliJ.CLIApplication.services.WordCountService;

@ShellComponent
public class CLIcommandsTest {

   
    private final WordCountService wordCountService = new WordCountService();



    @ShellMethod(key = "WordCountOfFile" ,value = "It will Count the frequency of words in a file in descending order.")
	public String wordCount(@ShellOption String filePath)
	{
		String result = null;
		try 
		{
			result = wordCountService.countWordFrequency(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
