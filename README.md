**# Twitter Trending Hashtags Tracker**

A lightweight Java implementation to track top trending hashtags in real-time using efficient data structures.

## Features
- Real-time hashtag frequency tracking
- Returns top 3 trending hashtags
- Optimized with HashMap (O(1) lookups) and Min-Heap (O(log n) updates)

## Tech Stack
- Java 11+
- Data Structures: HashMap, PriorityQueue (Min-Heap)
- Build Tool: Maven/Gradle (optional)

## Usage
```java
// Initialize tracker
TrendingService tracker = new TrendingService();

// Add hashtags
tracker.addHashtag("#java");
tracker.addHashtag("#python");

// Get top trends
List<Hashtag> trends = tracker.getTopTrending();
