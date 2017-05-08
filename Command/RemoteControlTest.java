package Design.Command;


public class RemoteControlTest {

    public static void main(String[] args) {
        //调用者，传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote = new SimpleRemoteControl();

//        //接受请求的对象
//        Light light = new Light();
//
//        //命令，将接受者传给他
//        LightOnCommand lightOn = new LightOnCommand(light);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
    }
}
