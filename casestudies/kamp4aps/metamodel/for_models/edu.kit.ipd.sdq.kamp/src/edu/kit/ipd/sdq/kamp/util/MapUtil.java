package edu.kit.ipd.sdq.kamp.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Provides some utilities for working with maps (which could be extensively 
 * used in propagation algorithms that want to store modified elements and 
 * related causing elements).
 */
public class MapUtil {

	/**
	 * Helper method for maps whose values are collections. This is an enhanced 
	 * <code>putAll()</code>: If a key of the second map does not exists in the 
	 * first one, the entry will be put as usual. However, if the key does already 
	 * exist, the value (which is a collection) of the second map will be added 
	 * to the value (which is a collection) of the first one instead of replacing it.
	 */
	public static <S,T extends Set<U>, U, V extends S, W extends Collection<? extends U>>
			void putOrAddToMap(Map<S, T> initialMap, Map<V, W> mapToAdd) {
		for (Map.Entry<V, W> entryToAdd: mapToAdd.entrySet()) {
			putOrAddToMap(initialMap, entryToAdd.getKey(), entryToAdd.getValue());
		}
	}
	
	/**
	 * Checks if the key exists and creates an entry if not. The values are 
	 * added to the set represented by the key.
	 */
	@SuppressWarnings("unchecked")
	public static <S,T extends Set<U>, U, V extends S, W extends Collection<? extends U>> 
			void putOrAddToMap(Map<S, T> map, V key, W values) {
		if (!values.isEmpty()) {
			if(!map.containsKey(key)) {
				map.put(key, (T) new HashSet<U>());
			}
			map.get(key).addAll(values);
		}
	}
	
	/**
	 * Checks if the key exists and creates an entry if not. The value is 
	 * added to the set represented by the key.
	 */
	@SuppressWarnings("unchecked")
	public static <S,T extends Set<U>, U, V extends U> void putOrAddToMap(
			Map<S, T> map, S key, V value) {
		if(!map.containsKey(key)) {
			map.put(key, (T) new HashSet<U>());
		}
		map.get(key).add(value);
	}

	/**
	 * Removes a collection of keys from a map.
	 */
	public static <S,T> void removeAllFromMap(Map<? super S, T> map, 
			Collection<? extends S> keysToRemove) {
		for (S key: keysToRemove) {
			map.remove(key);
		}
	}
	
	/**
	 * Removes a map with collection values from a map with collection values. If
	 * the first map contains a key of the second map, then the value (collection) of
	 * the second map is removed from the value (collection) of the first map. If the 
	 * value of the first map for that key is an empty collection after the removal,
	 * the key is also removed.
	 */
	public static <S,T extends Collection<U>, U> void removeAllFromMap(Map<? super S, T> map, 
			Map<? super S, T> mapToRemove) {
		for (Map.Entry<? super S, T> entryToRemove: mapToRemove.entrySet()) {
			if (map.containsKey(entryToRemove.getKey())) {
				map.get(entryToRemove.getKey()).removeAll(entryToRemove.getValue());
				if (map.get(entryToRemove.getKey()).isEmpty()) {
					map.remove(entryToRemove.getKey());
				}
			}
		}
	}
	
	/**
	 * Retains a collection of keys in a map.
	 */
	public static <S,T> void retainAll(Map<S, T> map, 
			Collection<? extends S> keysToRetain) {
		Set<S> keysToRemove = new HashSet<S>(map.keySet());
		keysToRemove.removeAll(keysToRetain);
		removeAllFromMap(map, keysToRemove);
	}

}
