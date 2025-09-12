package techmahindra.threading.communication.deadlock;

public class DeadLockEnabledResource {

    String resourceName;

    DeadLockEnabledResource(String resourceName) {
        this.resourceName = resourceName;
    }

    void addResource(DeadLockEnabledResource resource) {

        synchronized (this) {
            System.out.println("Processing resource in "+ this.resourceName + " inside add resource function");
            //notifyAll();
            //now r2 is calling by passing r1 which is already holing lock on r2
            resource.updateResource(resource);
        }

    }

    void updateResource(DeadLockEnabledResource resource) {

        synchronized (this) {
            System.out.println("Processing resource in "+ this.resourceName + " inside update resource function");
            //notifyAll();

            //now r1 is calling by passing r2 as parameter which is holding lock on r1
            resource.addResource(resource);
        }

    }


}
