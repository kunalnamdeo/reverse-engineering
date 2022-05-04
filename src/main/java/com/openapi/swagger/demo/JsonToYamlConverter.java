package com.openapi.swagger.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class JsonToYamlConverter {	

	public static void main(String[] args) {
		JsonToYamlConverter converter = new JsonToYamlConverter();
		converter.process("src\\main\\resources\\incoming-json.txt");
	}
	
	public void process(String filePath) {

		BufferedReader objReader = null;
		String strCurrentLine = null;
		String contentOfJson = "";

		try {

			if (filePath == null) {
				objReader = new BufferedReader(new FileReader("src\\main\\resources\\incoming-json.txt"));
			} else {
				objReader = new BufferedReader(new FileReader(filePath));
			}

			while ((strCurrentLine = objReader.readLine()) != null) {
				contentOfJson = contentOfJson + strCurrentLine + " \n";
			}

			
			// Convert in yaml content and create a .yaml file
			String yaml = convertInYaml(contentOfJson);
			
			//yaml = "openapi: 3.0.0 \ninfo: \n version: 0.0.1 \n title: Library Service by Kunal \n description: The Libray service \n" + yaml; 
			//yaml = "openapi: 3.0.0 \n" + yaml;  

			// Writing a .yaml file
			Path path = Paths.get("src\\main\\resources\\library.yaml");
			byte[] strToBytes = yaml.getBytes();
			Files.write(path, strToBytes);
			
			System.out.println("Json to Yaml file creation process completed. ::" + yaml);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (objReader != null)
					objReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public String convertInYaml(String jsonString) throws JsonProcessingException, IOException {

		// parse JSON
		JsonNode jsonNodeTree = new ObjectMapper().readTree(jsonString);

		// save it as YAML
		String jsonAsYaml = new YAMLMapper().writeValueAsString(jsonNodeTree);

		return jsonAsYaml;
	}
	
	
	public String convertInYmal2(String jsonString) {
		/*
		 * System.out.println("**********JSON string to enter**********");
		 * System.out.println(jsonString);
		 * 
		 * System.out.println("**********Convert JSON to Java object**********");
		 * ObjectMapper mapper = new ObjectMapper(); Map<String, Object> obj =
		 * mapper.readValue(src, valueTypeRef)(, new TypeReference<Map<String,
		 * Object>>() { }); System.out.println(ObjectDumper.dump(obj));
		 * 
		 * System.out.println("**********Convert Java objects to YAML**********");
		 * DumperOptions opts = new DumperOptions();
		 * opts.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK); String yaml = new
		 * Yaml(opts).dump(obj); System.out.println(yaml);
		 */	
		return null;
		
	}

}
