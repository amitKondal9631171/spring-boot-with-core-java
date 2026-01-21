package techmahindra.threading.communication.deadlock;

public class DeadLockEnabledResource {

    String resourceName;

    DeadLockEnabledResource(String resourceName) {
        this.resourceName = resourceName;
    }

    void addResource(DeadLockEnabledResource resource) {

        synchronized (this) {
            System.out.println("Processing resource "+ this.resourceName + " inside add resource function");
            resource.updateResource(resource);
        }

    }

    void updateResource(DeadLockEnabledResource resource) {

        synchronized (this) {
            System.out.println("Processing resource "+ this.resourceName + " inside update resource function");
            resource.addResource(resource);
        }

    }


}
