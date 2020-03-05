package NopCommerceTesting;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils {
    private String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    BrowserSelector browserSelector=new BrowserSelector();


    @Before
    //open browser
    public void openBrowser()
    {
        browserSelector.SetUpBrowser();
    }

    @After
    //close browser
    public void closeBrowser(Scenario scenario) throws IOException
    {
        if (scenario.isFailed()){
          String screenshotName =scenario.getName().replaceAll("[.,:;?!]","")+timestamp + ".png";
          try{
              //This takes a screenshot from the driver and save it to the specified location
              File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
              //Building up to the destination path for the screenshot to save
              File destinationPath=new File(System.getProperty("user.dir") +"/target/Destination/Screenshots/"+screenshotName);
              //Copy taken screenshot for source to destination folder
              copyFile(sourcePath,destinationPath);
              scenario.write("!!!!!!!!!!!!...Scenario failed.Please see attached screenshot for the error");
              //Attach screenshot to our report
              scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
          }catch(IOException e){

          }
          driver.quit();
        }


    }


}
