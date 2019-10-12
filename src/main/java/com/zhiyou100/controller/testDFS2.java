package com.zhiyou100.controller;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月23日 下午2:57:33 

* 类说明 

*/
public class testDFS2 {

	public 	void up() throws IOException, MyException {
		
			// 1. 加载配置文件
		ClientGlobal.init("E:\\work\\SSM-MAVEN\\src\\test\\resources\\fastdfs-client.properties");
			// 2. 创建管理端对象
			TrackerClient trackerClient = new TrackerClient();
			// 3. 通过管理端对象获取连接
			TrackerServer connection = trackerClient.getConnection();
			// 4. 创建存储端对象
			StorageClient1 storageClient = new StorageClient1(connection, null);

			// 创建文件属性信息对象数组
			NameValuePair list [] = new NameValuePair[1];
			list[0] = new NameValuePair("fileNAme","5.png");
			String path =  storageClient.upload_file1("E:\\2.png","png",list);
			System.out.println(path);
		
		
		}

	public void down() throws IOException, MyException {
		String dString = "group1/M00/00/00/wKg4gF2IeMOAOA_HAAUTuhgvnj4071.png";
		// 1. 加载配置文件
		ClientGlobal.init("E:\\work\\SSM-MAVEN\\src\\test\\resources\\fastdfs-client.properties");
			// 2. 创建管理端对象
			TrackerClient trackerClient = new TrackerClient();
			// 3. 通过管理端对象获取连接
			TrackerServer connection = trackerClient.getConnection();
			// 4. 创建存储端对象
			StorageClient1 storageClient = new StorageClient1(connection, null);
			byte[] byts = storageClient.download_file1(dString);
			OutputStream out =  new FileOutputStream("E:\\4.png"); 
			out.write(byts);
			out.close();
			System.out.println("成功");
	}

	public void dd() throws IOException, MyException {
		String dString = "group1/M00/00/00/wKg4gF2IeMOAOA_HAAUTuhgvnj4071.png";
		// 1. 加载配置文件
		ClientGlobal.init("E:\\work\\SSM-MAVEN\\src\\test\\resources\\fastdfs-client.properties");
			// 2. 创建管理端对象
			TrackerClient trackerClient = new TrackerClient();
			// 3. 通过管理端对象获取连接
			TrackerServer connection = trackerClient.getConnection();
			// 4. 创建存储端对象
			StorageClient1 storageClient = new StorageClient1(connection, null);
			int file1 = storageClient.delete_file1(dString);
			System.out.println(file1);
			
	}
}
