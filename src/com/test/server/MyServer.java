package com.test.server;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.*;

//注意此程序是按照hadoop1.1.2的RPC规范实现
public class MyServer {
	public static final String ADDRESS = "localhost";
	public static final int PORT = 12345;

	public static void main(String[] args) throws Exception {
		/**
		 * 构造一个RPC的服务端.
		 * 
		 * @param instance
		 *            这个实例中的方法会被调用
		 * @param bindAddress
		 *            绑定的地址是用于监听连接的
		 * @param port
		 *            绑定的端口是用于监听连接的
		 * @param conf
		 *            the configuration to use
		 */
		final Server server = RPC.getServer(new MyBiz(), ADDRESS, PORT,
				new Configuration());
		server.start();

	}
}
