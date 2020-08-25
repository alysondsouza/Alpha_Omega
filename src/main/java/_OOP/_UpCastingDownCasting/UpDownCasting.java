package _OOP._UpCastingDownCasting;

public class UpDownCasting {
    public static void main(String[] args) {

        Machine m1 = new Machine();
        m1.machineMethod();

        Camera c1 = new Camera();
        c1.machineMethod();
        c1.cameraMethod();

        //UPCASTING
        Machine m2 = new Camera();
        m2.machineMethod();

        //DOWNCASTING
        Machine m3 = new Camera();
        Camera c3 = (Camera) m3;
        c3.machineMethod();
        c3.cameraMethod();
    }
}

class Machine {
    public void machineMethod() {
        System.out.println("Machine method");
    }
}

class Camera extends Machine {
    public void cameraMethod() {
        System.out.println("Camera method");
    }
}
