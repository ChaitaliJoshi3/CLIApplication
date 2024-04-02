
/* This class will be entry point of shell method 
	so class is annoted with @ShellComponent
 * 
 */
package dev.chaitaliJ.CLIApplication.commands;



import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


import dev.chaitaliJ.CLIApplication.services.WordCountService;

@ShellComponent
public class CLIcommands {

   
    private final WordCountService wordCountService = new WordCountService();


	//This method is Shell method, Key of this method will be the command to be executed.
    @ShellMethod(key = "WordCountOfFile" ,value = "It will Count the frequency of words in a file in descending order.")
	public String wordCount(@ShellOption String filePath)
	{
		String result = null;
		try 
		{
			System.out.println(filePath);
			result = wordCountService.countWordFrequency(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
