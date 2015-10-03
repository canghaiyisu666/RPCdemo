package com.test.server;

import java.io.IOException;

//注意此程序是按照hadoop1.1.2的RPC规范实现
public class MyBiz implements MyBizable {
	/*
	 * @see rpc.MyBizable#hello(java.lang.String)
	 */
	@Override
	public String hello(String name) {
		System.out.println("服务端被调用了");
		return "hello " + name;
	}

	/*
	 * @see rpc.MyBizable#getProtocolVersion(java.lang.String, long)
	 */
	@Override
	public long getProtocolVersion(String arg0, long arg1) throws IOException {
		return VERSION;
	}

}
