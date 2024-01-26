package org.example;

import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

import java.time.Duration;

import static utilities.BaseClass.selectBrowser;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://staging.waaw.ca/");
        // Perform your tests...

        driver.quit();
        /*int[] a={1,2,5,10,12,14};
        int[] result=new int[2];
        int target=12;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int sum=a[i]+a[j];
                if(sum==target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }*/
    }
}