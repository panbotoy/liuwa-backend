# liuwa-backend
The backend for Liuwa app

#The package structure:
liuwabackend.rest      All client facing controllers should go here.

liuwabackend.services  All heavy lifting business logic should go here.

liuwabackend.dao       Data Access layer
 
liuwabackend.datamodels Data Model defined for data access layers. Could be used through out the stack.

liuwabackend.viewmodels Data models defined for rendering UI components. Usually built based with multiple/one/partial datamodels.

#Work with GCP Cloud Datastore
https://github.com/objectify/objectify/wiki/Setup

#To setup emulator
gcloud components install cloud-datastore-emulator

# to run emulator
gcloud beta emulators datastore start --host-port=localhost:8484

# if there are issues with Datastore unauthenticated failure
run this command: gcloud auth login

# to test it runs locally
