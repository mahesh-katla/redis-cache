package com.example.rediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RediscacheApplication {
	/***
	 * What is Redis Cache?
	 * Redis, which stands for Remote Dictionary Server, is a fast, open-source,
	 * in-memory, key-value data store. The project started when Salvatore Sanfilippo,
	 * the original developer of Redis, wanted to improve the scalability of his Italian startup.
	 * From there, he developed Redis, which is now used as a database, cache, message broker, and queue.
	 * Redis is an open-source (BSD licensed), in-memory data structure store, used as a database, cache, and message broker.
	 * Redis provides data structures such as strings, hashes, lists, sets, and sorted sets with range queries, bitmaps,
	 * hyperloglogs, geospatial indexes, and streams.
	 * Redis has built-in replication, Lua scripting, LRU eviction, transactions, and different levels of on-disk persistence,
	 * and provides high availability via Redis Sentinel and automatic partitioning with Redis Cluster.
	 *
	 * Why use Redis Cache?
	 * Redis is a great choice for implementing a highly available in-memory cache to decrease data access latency,
	 * increase throughput, and ease the load off your relational or NoSQL database and application.
	 * Redis can serve frequently requested items at sub-millisecond response times and enables you to easily scale for higher loads
	 * without growing the costlier backend. Database query results caching, persistent session caching, web page caching and
	 * caching of frequently used objects such as images, files, and metadata are all popular examples of caching with Redis.
	 * Redis can be used with streaming solutions such as Apache Kafka and Amazon Kinesis as an in-memory data store to ingest, process,
	 * and analyze real-time data with sub-millisecond latency.
	 * Redis is an ideal choice for real-time analytics use cases such as social media analytics, ad targeting, personalization, and IoT.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RediscacheApplication.class, args);
	}

}
