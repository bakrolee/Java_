package kr.co.greenart.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class FileSystemRepository implements FileRepository {
	private final File saveFolder = new File("d:\\temp\\");
	private final Path root = Paths.get("d:\\temp\\");;
	
	@Override
	public Resource getByName(String fileName) {
		try {
			return new UrlResource(new File(saveFolder.getAbsolutePath() 
					+ File.separatorChar 
					+ fileName).toURI());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<String> getAllnames() {
		File[] filearr = saveFolder.listFiles(new FileFilter() {
			// listFiles = 파일 뿐만 아니라, 폴더도 가져옴.
			@Override
			public boolean accept(File pathname) {
				// 디렉토리 제외한 파일들만 가져오게 필터링. 
				return !pathname.isDirectory();
			}
		});
		
		List<String> list = new ArrayList<>();
		for (File f : filearr) {
			if (!f.isDirectory()) {
				list.add(f.getName());
			}
		}
		return list;
		
//		try {
//			Files.walk(root, 1)  // walk : 해당경로에 첫번째 위치에 있는 모든 파일,폴더를 다 가져옴.
//			// filter는 Stream타입에 있는 형식 (jdk 8부터 생김)
//			// 함수형 프로그래밍.
//			// 란다식 = 좌측은 파라미터, 화살표 우측은 메소드 바디(함수)
//				.filter(t -> !t.equals(this.root))
//				.filter(x -> !Files.isDirectory(x))
//				.map(y -> y.toString())
//				.collect(Collectors.toList());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public int save(MultipartFile file) {
		File saveFolder = new File("d:\\temp\\");
		if (!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		try {
			file.transferTo(new File(saveFolder.getAbsolutePath() 
						+ File.separatorChar 
						+ file.getOriginalFilename()));
			return 1;
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return 0;
		}
		
		// 둘중에 편한 걸로 쓰면 됨.
//		Path saveFolder = Paths.get("d:\\");
//		try {
//			if (!Files.exists(saveFolder)) {
//				Files.createDirectories(saveFolder);
//			}
//			file.transferTo(saveFolder.resolve(Paths.get(file.getOriginalFilename()).normalize()));
//			return 1;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return 0;
//		}
	}
}






