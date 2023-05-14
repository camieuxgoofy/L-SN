import { useEffect, useRef } from "react";
import { Splide, SplideSlide } from "@splidejs/react-splide";
import "@splidejs/react-splide/css";
import "@/../css/main.css";

export default function Component() {
    const mainSliderRef = useRef(null);
    const thumbnailSliderRef = useRef(null);

    useEffect(() => {
        if (mainSliderRef.current && thumbnailSliderRef.current) {
            const mainSlider = mainSliderRef.current.splide;
            const thumbnailSlider = thumbnailSliderRef.current.splide;

            mainSlider.sync(thumbnailSlider);
        }
    }, []);
    return (
        <>
            <Splide
                options={{
                    type: "fade",
                    heightRatio: 0.5,
                    pagination: false,
                    arrows: false,
                    cover: true,
                }}
                ref={mainSliderRef}
            >
                <SplideSlide>
                    <img src="https://tecdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(73).webp" />
                </SplideSlide>
                <SplideSlide>
                    <img src="https://tecdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(75).webp" />
                </SplideSlide>
            </Splide>

            <Splide
                options={{
                    rewind: true,
                    fixedWidth: 104,
                    fixedHeight: 58,
                    isNavigation: true,
                    gap: 10,
                    focus: "center",
                    pagination: false,
                    cover: true,
                    dragMinThreshold: { mouse: 4, touch: 10 },
                    breakpoints: {
                        640: { fixedWidth: 66, fixedHeight: 38 },
                    },
                }}
                ref={thumbnailSliderRef}
            >
                <SplideSlide>
                    <img src="https://tecdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(73).webp" />
                </SplideSlide>
                <SplideSlide>
                    <img src="https://tecdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(75).webp" />
                </SplideSlide>
            </Splide>
        </>
    );
}
