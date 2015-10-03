package com.test.server;

//注意此程序是按照hadoop1.1.2的RPC规范实现
public interface MyBizable extends org.apache.hadoop.ipc.VersionedProtocol {
	long VERSION = 1L;

	public String hello(String name);
}