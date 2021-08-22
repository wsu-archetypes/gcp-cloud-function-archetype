# Google Cloud Function project

This project uses Google Cloud Function framework that provides the following Maven goals:
 - function:run

   This goal will run the cloud function locally and make it available at http://localhost:8080:
   If your function requires a service account, you will need to setup this service account locally.

 - function:deploy 

   This goal will deploy the cloud function in the GCP project specified. 