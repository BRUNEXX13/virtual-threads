  # java-virtual-threads-example
  
  To run the tests, simply execute the main method of each execution class:
  
  #### Execution without thread control: ``br.com.ss.ExecutionStandard.main``
  
  #### Execution with defined thread pool ``br.com.ss.ExecucaoThreadPool.main``
  
  #### Execution with Virtual Threads: ``br.com.ss.ExecucaoVirtualThreads.main``
  _____________________________________________________________________________________________________________________________________________________________________________________________________________________
  
  🚀 Java Virtual Threads: a paradigm shift in concurrency 
  
  With Project Loom, the Java ecosystem has gained one of the most significant innovations since Generics and Streams: Virtual Threads.
  
  🔸 Introduced in Java 19 (2022) as a preview feature.
  🔸 Kept in Java 20 (2023) still as preview.
  🔸 Became stable in Java 21 (2023, LTS).
  
  They are not just an incremental optimization, but rather a new concurrency model in Java.
  
  🔹 Traditional Threads
  
  Implementation: mapped 1:1 to operating system threads.
  
  Cost: high memory usage (≈1MB per thread).
  Scalability: applications rarely scale beyond tens of thousands of threads.
  Typical use: CPU-bound workloads or environments with a predictable, limited number of connections.
  
  🔹 Virtual Threads
  
  Implementation: managed by the JVM, multiplexed over a small number of carrier (native) threads.
  
  Cost: extremely lightweight (KBs per thread).
  Scalability: supports millions of threads without exhausting system resources.
  Typical use: I/O-bound workloads such as HTTP servers, database access, and messaging systems.
  
  ⚡ Impact on Performance and Architecture
  
  Linear scalability: capable of handling millions of concurrent connections without complex thread pools.
  
  Lower latency: blocking calls no longer stall the application the JVM simply parks the virtual thread until the resource is available.
  
  Simpler code: removes the need for reactive programming or callback-based designs just to handle massive concurrency.
  
  📌 Practical example
  
  🔸 Before (Java 817): handling 10k concurrent connections required carefully tuned pools, NIO, and complex logic.
  🔸 Now (Java 21+): millions of connections can be served with imperative, clean, and maintainable code.
  
  👉 In summary
  
  Native threads → still useful for CPU-bound workloads.
  
  Virtual Threads (Java 21) → best suited for I/O-bound, scalable, lightweight, and easier-to-maintain applications.
  
  💡 Conclusion
  Virtual Threads, solidified in Java 21 LTS, position Java on par with modern concurrency models in languages like Go and Kotlin coroutines while retaining the robustness and maturity of the JVM.

  ![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://media.licdn.com/dms/image/v2/D4D22AQF-seST7bmp3g/feedshare-shrink_1280/B4DZmLh36DJgAs-/0/1758982538504?e=1762387200&v=beta&t=TLKTICUKCM-vsX4QyEgx4ijisXbaPS4Zxqxn5nLwask)
  
