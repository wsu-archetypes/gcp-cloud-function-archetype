package ${package};;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class MyFunction implements HttpFunction {

    // More information about Google Cloud Function can be found here: https://cloud.google.com/functions
    // The cloud function framework used in this project can be found here: https://github.com/GoogleCloudPlatform/functions-framework-java 
    // To be able to deploy the cloud function from Maven you'd need to have:
    //   - a GCP project
    //   - Enable these APIs:
    //       - Cloud Function API
    //       - Cloud Build API
    // The first time you run function:deploy, it will install Google Cloud SDK in your home directory.
    // On Windows, it will be under %LOCALAPPDATA%\google
    // 
    // If you've never setup Google Cloud account on the machine, you will need to run "gcloud auth login" and "gcloud config set project" 
    // before you can continue with deploy

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        response.getWriter().write("Hello from CloudFunction");
    }
}