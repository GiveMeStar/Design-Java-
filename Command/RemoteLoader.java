package Design.Command;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //创建电灯对象
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        //创建电灯命令并传入接受命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        //将命令对象加载到遥控器插槽中
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
