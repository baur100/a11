package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
    private static Logger logger = LogManager.getLogger(Listeners.class);
    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.debug("+++Test "+iTestResult.getName()+" started+++");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.trace("Test "+iTestResult.getName()+" successfully finished");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.error("Test "+iTestResult.getName()+" failed");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
