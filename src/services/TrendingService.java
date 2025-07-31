package services;

import models.Hashtag;
import java.util.*;

public class TrendingService {
    private Map<String, Integer> hashtagCounts;
    private PriorityQueue<Hashtag> minHeap;
    private final int TRENDING_LIMIT = 3;

    public TrendingService() {
        hashtagCounts = new HashMap<>();
        minHeap = new PriorityQueue<>(
                (a, b) -> a.getCount() - b.getCount()
        );
    }

    public void addHashtag(String name) {
        // Update count
        int count = hashtagCounts.getOrDefault(name, 0) + 1;
        hashtagCounts.put(name, count);

        // Update heap
        Hashtag hashtag = new Hashtag(name, count);
        if (minHeap.contains(hashtag)) {
            minHeap.remove(hashtag);
        } else if (minHeap.size() >= TRENDING_LIMIT) {
            if (count > minHeap.peek().getCount()) {
                minHeap.poll();
            } else {
                return; // Not enough counts to be in top trends
            }
        }
        minHeap.offer(hashtag);
    }

    public List<Hashtag> getTopTrending() {
        List<Hashtag> topTrends = new ArrayList<>(minHeap);
        topTrends.sort((a, b) -> b.getCount() - a.getCount());
        return topTrends;
    }
}