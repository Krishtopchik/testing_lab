using OpenQA.Selenium;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;


namespace Lab5_SeleniumWebDriver
{
    [TestFixture]
    class Test
    {
        IWebDriver driver;

        [SetUp]
        public void Setup()
        {
            driver = new OpenQA.Selenium.Chrome.ChromeDriver();
            driver.Manage().Window.Maximize();
            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(20);

        }

        [TearDown]
        public void cleanup()
        {
            driver.Quit();
        }

        [Test]
        public void SearchWithoutValidData()
        {
            try
            {
                driver.Navigate().GoToUrl("https://www.priceline.com/");
                IWebElement dest = driver.FindElement(By.ClassName("sc-iGPElx"));
                dest.Click();
                dest.Clear();   
                dest.SendKeys("test");
                Thread.Sleep(5000);
                IWebElement select = driver.FindElement(By.ClassName("sc-hmXxxW"));
                dest.Click();
                select.Click();
                Thread.Sleep(5000);
                IWebElement searchForm = driver.FindElement(By.ClassName("sc-eXNvrr"));
                searchForm.Click();
                Thread.Sleep(500000);
            }
            catch (Exception e)
            {
                driver.Close();
                Console.WriteLine(e.Message);
            }
        }

        [Test]
        public void Registration()
        {
            try
            {
                driver.Navigate().GoToUrl("https://www.priceline.com/");
                IWebElement btn = driver.FindElement(By.Id("in-path-sign-in-out-click"));
                btn.Click();
                Thread.Sleep(1000);
                IWebElement enter = driver.FindElement(By.Id("register-link-variant"));
                enter.Click();
                Thread.Sleep(1000);
                IWebElement firstName = driver.FindElement(By.Id("registration-first-name"));
                IWebElement lastName = driver.FindElement(By.Id("registration-last-name"));
                IWebElement email = driver.FindElement(By.Id("registration-email"));
                IWebElement password = driver.FindElement(By.Id("registration-password"));
                IWebElement confirmPassword = driver.FindElement(By.Id("registration-confirm-password"));
                //registration-first-name registration-last-name registration-email 
                //registration-password registration-confirm-password
                firstName.Click();
                firstName.SendKeys("test");
                lastName.Click();
                lastName.SendKeys("test");
                email.Click();
                email.SendKeys("test@gmail.com");
                password.Click();
                password.SendKeys("testtest");
                confirmPassword.Click();
                confirmPassword.SendKeys("testtest");
                Thread.Sleep(50000);
                IWebElement submit = driver.FindElement(By.Id("registration - submit"));
                submit.Click();
            }
            catch (Exception e)
            {
                driver.Close();
                Console.WriteLine(e.Message);
            }
        }
    }
}