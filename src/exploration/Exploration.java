package exploration;

import org.lwjgl.Sys;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Exploration {
	public static void main(String[] args) {
		glfwInit();
		
		glfwSetErrorCallback(errorCallbackPrint(System.err));
		
		glfwDefaultWindowHints();
		long window = glfwCreateWindow(1280,720,"Testhoi",0,0);
		glfwMakeContextCurrent(window);
		glfwSwapInterval(1);
		glfwShowWindow(window);
		
		while (true) {
			
		}
	}
}
