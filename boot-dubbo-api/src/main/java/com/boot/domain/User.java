package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Description Serializable的作用
 * 1.序列化的过程，就是一个"freeze"的过程，它将一个对象freeze住，然后进行存储，等到再次需要的时候，
 *   再将这个对象“de-freeze”解冻就可以使用
 * 2.类里面的int,long,boolean基本数据类型，数据库里有与之对应的数据结构。从类声明来看，我们以为没有进行序列化，
 *   其实是在声明的各个不同变量时，由具体的数据类型帮助我们实现了序列化，所以就算我们不去序列化依旧可以正常操作。
 * 3.既然实体类里的变量都已经帮助我们实现了序列化，为什么还要实体类去实现Serializable接口？
 *   序列化的目的有两个，一个是便于存储，二是便于传输。如果我们不去序列化，那要看存储媒体里是否有相对应的数据结构，
 *   还有这个实体类是否需要远程传输（或者是两个不同的系统甚至是分布式模块之间的调用）
 *   如果有注意观察的话，发现序列化操作用于存储时，一般是对于NoSql数据库，而在使用Nosql数据库进行存储时，用“freeze”这个说法
 *   来理解是再恰当不过了，请在NoSql数据库中，给我找出个varchar，int之类的数据结构出来？ 如果没有，但我们又确实需要进行存储，
 *   那么，此时程序员再不将对象进行序列化，更待何时？
 *
 * 4.如果有人打开过Serializable接口的源码，就会发现，这个接口其实是个空接口，那么这个序列化操作，到底是由谁去实现了呢？其实，
 *   看一下接口的注释说明就知道，当我们让实体类实现Serializable接口时，其实是在告诉JVM此类可被序列化，可被默认的序列化机制序列化。
 *   然后，需要说明的是，当我们在实体类声明实现Serializable接口时，再次进行观察，会发现这些类是需要被远程调用的。也就是说需要
 *   或者可能需要被远程调用，这就是序列化便于传输的用途。
 * @Authr wangfeng
 * @Date 2021-06-15 14:30:11
 */

@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}