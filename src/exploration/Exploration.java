package exploration;

import org.lwjgl.glfw.*;

public class Exploration {
	public static void main(String[] args) {
		GLFW.glfwGetTime();
		long window = GLFW.glfwCreateWindow(800,600,"Testhoi",0,0);
		GLFW.glfwMakeContextCurrent(window);
		GLFW.glfwSwapInterval(1);
		GLFW.glfwShowWindow(window);
		
		while (true){
			
		}
	}
}
