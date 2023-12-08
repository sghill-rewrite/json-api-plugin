package io.jenkins.plugins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class SmokeTest {
    @Test
    void smokeTest(JenkinsRule jenkinsRule) throws Exception {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put("foo");
        jsonArray.put("bar");
        assertEquals("[\"foo\",\"bar\"]", jsonArray.toString());
        JSONObject jsonObject = new JSONObject();
        assertTrue(jsonObject.isEmpty());
        jsonObject.put("array", Arrays.asList("foo", "bar"));
        jsonObject.optJSONArray("array"); // Added on 20231013
    }
}
